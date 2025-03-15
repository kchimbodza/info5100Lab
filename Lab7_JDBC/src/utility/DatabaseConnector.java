/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author rishabhkaushick
 */
public class DatabaseConnector {
    
    // DB_URL = "jdbc:<database>://ip_address:port/database_name";
    static final String DB_URL = "jdbc:mysql://localhost:3306/customerdb";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "docker123";
    
    // Create a connection
    
    // CRUD Operations
    
    // CRUD Operations on Database
    
    // C - Create: Inserting data into the database
    public static void addUser(User u1) throws SQLException{
        String query = "INSERT INTO student(first_name, last_name, gender, age, phone, email, hobbies) VALUES (?, ?, ?, ?, ?, ?, ?) ";
        
        try{
            // Create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, u1.getName());
            stmt.setString(2, u1.getLast()); 
            stmt.setString(3, u1.getGender());
            stmt.setInt(4, u1.getAge());            
            stmt.setString(5, u1.getPhone());
            stmt.setString(6, u1.getMail());
            stmt.setString(7, u1.getHobby());
           
            
            // After this query will look like:
            // "INSERT INTO patient(first_name, age, college, hobbies) VALUES ('Rish', 28, 'COE', 'Football, guitar') "
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted: "+rows);
            
            // Close the connection
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        
    }
    // R - Read: Getting all the values from the database
    public static ArrayList<User> getUsers(){
        ArrayList <User> users = new ArrayList();
        String query = "SELECT * FROM student";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                User u1 = new User();
                u1.setUserId(rs.getInt("student_id"));
                u1.setName(rs.getString("first_name"));
                u1.setLast(rs.getString("last_name"));
                u1.setGender(rs.getString("gender"));
                u1.setAge(rs.getInt("age"));
                u1.setPhone(rs.getString("phone"));
                u1.setMail(rs.getString("email"));
                u1.setHobby(rs.getString("hobbies"));
                users.add(u1);
            }
            rs.close();
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return users;
    }
    
    // U - Update: Changing a value in the database
    public static void updateUser(User oldUser, User updatedUser){
        // Removed gender
            String query = "UPDATE student SET first_name = ?, last_name = ?, gender =?, age=?, phone = ?, email =?, hobbies = ? WHERE student_id = ? ";
            
            // Update the query
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatedUser.getName());
            stmt.setString(2, updatedUser.getLast());
            stmt.setString(3, updatedUser.getGender());
            stmt.setInt(4, updatedUser.getAge());
            stmt.setString(5, updatedUser.getPhone());
            stmt.setString(6, updatedUser.getMail());
            stmt.setString(7, updatedUser.getHobby());
            
            stmt.setInt(8, oldUser.getUserId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows updated: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    // D - Delete 
    public static void deleteUser(User u1){
        String query = "DELETE FROM student WHERE student_id = ?";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, u1.getUserId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class User {
    private String name, last, gender, phone, mail, hobby;
    private int age;
    private File photo;
    private ImageIcon scaledIcon;
    private Date dob;

    public ImageIcon getScaledIcon() {
        return scaledIcon;
    }

    public void setScaledIcon(ImageIcon scaledIcon) {
        this.scaledIcon = scaledIcon;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }
    
    public Date getDob(){
        return dob;
    }
    
    public void setDob(Date dob){
        this.dob =  dob;
    }
    
    

    @Override
public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Define the format
    String formattedDob = (dob != null) ? sdf.format(dob) : "N/A";
    return """
           Welcome
           Name: """ + name + "\n" +
           "Surname: " + last + "\n" +
           "Gender: " + gender + "\n" +
           "Phone: " + phone + "\n" +
           "Mail: " + mail + "\n" +
           "Age: " + age + "\n" +
           "Hobbies: " + hobby + "\n" +
           "Date of Birth: " + formattedDob  ;  
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class User {
    
    //Data Members
    private int userId;
    private String name, last, gender, phone, mail, hobby;
    private int age;
   // private File photo;
    //private ImageIcon scaledIcon;
    //private Date dob;
    // Methods

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    @Override
public String toString() {
   
   return """ 
           Welcome Name: """ + name + "\n" +
           "Surname: " + last + "\n" +
           "Gender: " + gender + "\n" +
           "Phone: " + phone + "\n" +
           "Mail: " + mail + "\n" +
           "Age: " + age + "\n" +
           "Hobbies: " + hobby ;
           
    } 
}

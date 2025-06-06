package com.xworkz.instagram.things;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstagramUserDetails extends Object{

    //properties
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDateTime createdOn;

    //create constructor
    public InstagramUserDetails(){
        System.out.println("No-args constructors");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
        public void setDateOfBirth(LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
        }
        public void setCreatedOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
        }
        //getter methods
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }
//override the toString()


    @Override
    public String toString() {
        return "Name:"+name+","+"Email:"+email+","+" Data of birth:"+dateOfBirth+","+"created on:"+createdOn;
    }
}



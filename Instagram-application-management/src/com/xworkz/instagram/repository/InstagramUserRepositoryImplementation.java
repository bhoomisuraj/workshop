package com.xworkz.instagram.repository;

import com.xworkz.instagram.things.InstagramUserDetails;

public class InstagramUserRepositoryImplementation implements InstagramUserRepository {
    //array
    private InstagramUserDetails[] listOfUsers = new InstagramUserDetails[3];
    private int index = 0;

    @Override
    public void saveUserDetails(InstagramUserDetails details) {
        System.out.println("details:" + details);
        if (this.index < listOfUsers.length) {
            System.out.println("we can save the details");
            listOfUsers[this.index] = details;
            this.index++;
            System.out.println("save successfully");
        } else {
            System.out.println("Array is full we can't save the data");
        }
    }

    @Override
    public void readInstagramUsers() {
        System.out.println("Reading Instagram User details!!");
        for (InstagramUserDetails details : listOfUsers) {
            System.out.println("user details:" + details);
        }
    }

    @Override
    public void findUserDetails(String name) {
        System.out.println("find User details method invoked");
        for (int i = 0; i < listOfUsers.length; i++) {
            if (listOfUsers[i].getName().equalsIgnoreCase(name)) {
                System.out.println("User is present");
                System.out.println("details are:" + listOfUsers[i]);
            }
        }
    }
    @Override
    public void findUserDetails(String name,String email){
        System.out.println("find User details method invoked");
        for (int i=0; i< listOfUsers.length;i++){
            if(listOfUsers[i].getEmail().equalsIgnoreCase(email)){
                System.out.println("user is present");
                System.out.println("user details are:" + listOfUsers[i]);
            }else{
                System.out.println("user is not present");
            }
        }
    }

    }











package com.xworkz.instagram.runner;

import com.xworkz.instagram.repository.InstagramUserRepository;
import com.xworkz.instagram.repository.InstagramUserRepositoryImplementation;
import com.xworkz.instagram.things.InstagramUserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstagramRunner {
    public static void main(String[] args) {
        new InstagramUserDetails();
        InstagramUserDetails instagramUserDetails = new InstagramUserDetails();
        instagramUserDetails.setName("bhoomi");
        instagramUserDetails.setEmail("bhoomi@gmail123");
        instagramUserDetails.setDateOfBirth(LocalDate.of(2006,9,29));
        instagramUserDetails.setCreatedOn(LocalDateTime.now());
        System.out.println(instagramUserDetails.toString());

        InstagramUserDetails User1 = new InstagramUserDetails();
        User1.setName("suraj");
        User1.setEmail("suraj@gmail123");
        User1.setDateOfBirth(LocalDate.of(1978,11,11));
        User1.setCreatedOn(LocalDateTime.now());
        System.out.println(User1.toString());

        InstagramUserDetails User2 = new InstagramUserDetails();
        User2.setName("shilpa");
        User2.setEmail("shilpa@gmail123");
        User2.setDateOfBirth(LocalDate.of(1982,7,28));
        User2.setCreatedOn(LocalDateTime.now());
        System.out.println(User2.toString());


        System.out.println("Welcome to Instagram!!!!");
        //create a instance of repository
        InstagramUserRepository repo = new InstagramUserRepositoryImplementation();
        repo.saveUserDetails(instagramUserDetails);
        repo.saveUserDetails(User1);
        repo.saveUserDetails(User2);
        repo.readInstagramUsers();
        repo.findUserDetails("bhoomi");
    }
}

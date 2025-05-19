package com.xworkz.ipl.application;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int systemNumber = random.nextInt(10);
        System.out.println("Welcome to number Guessing Game");
        System.out.println("Hello user Enter the number of your choice between 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        if(systemNumber == userNumber) {
            System.out.println("Number is matching:!!");
            System.out.println("system number is:" + userNumber);
        }else {
            System.out.println("You Guess the wrong Number");
            System.out.println("system number is:" + systemNumber);
            System.out.println("user number is:" + userNumber);
        }
    }
}

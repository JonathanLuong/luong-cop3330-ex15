package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("What is the username? ");
        String user = reader.nextLine();
        System.out.printf("What is the password? ");
        String password = reader.nextLine();

        if(password.equals("abc$123")) {
            System.out.printf("Welcome!");
        }
        else {
            System.out.printf("I don't know you.");
        }
    }
}
package com.twittermessagingengine2;

import java.util.Scanner;

public class Driver {
    // test method (for use before test class)
    public static void main(String[] args) {
        String myMessage;
        Scanner scan = new Scanner(System.in);

        System.out.println("Message:");
        myMessage = scan.nextLine();

        Engine myObject = new Engine(myMessage);

        myObject.isCorrectLength();
        myObject.getMessage();
        myObject.detectMentions();
        myObject.detectTopics();
        myObject.detectUrls();
    }
}
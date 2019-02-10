package com.twittermessagingengine2;

import java.util.Scanner;

public class Driver {
    // test method (for use before test class)
    public static void main(String[] args) {
        Engine myObject = new Engine();
        String myMessage;
        Scanner scan = new Scanner(System.in);

        System.out.println("Message:");
        myMessage = scan.nextLine();

        myObject.isCorrectLength(myMessage);
        myObject.getMessage(myMessage);
        myObject.detectMentions(myMessage);
        myObject.detectTopics(myMessage);
        myObject.detectUrls(myMessage);
    }
}
package com.twittermessagingengine2;

import java.util.Scanner;
import java.util.Arrays;

public class Driver {
    // test method (for use before test class)
    public static void main(String[] args) {
        String myMessage;
        Scanner scan = new Scanner(System.in);

        System.out.println("Message:");
        myMessage = scan.nextLine();

        Engine myObject = new Engine(myMessage);

        System.out.println();
        System.out.println(myObject.getTweet());
        System.out.println();

        System.out.println("Mentions: ");
        System.out.println(Arrays.toString(myObject.getMentions()));
        System.out.println();

        System.out.println("Topics: ");
        System.out.println(Arrays.toString(myObject.getTopics()));
        System.out.println();

        System.out.println("URL's: ");
        System.out.println(Arrays.toString(myObject.getLinks()));
        System.out.println();

    }

}
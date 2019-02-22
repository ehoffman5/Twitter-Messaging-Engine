package com.twittermessagingengine2;


import java.net.URL;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.lang.String;


 public class Engine {
     private String[] mentions;
     private String[] topics;
     private String[] references;

     private String tweet;

     public Engine (String tweet) {
         this.tweet = tweet;

         String mentionRegex = "(@[\\w_-]+)";
         String hashtagRegex = "(#[\\w_-]+)";
         String urlRegex = "(http?|ftp|file):\\/\\/[-a-zA-Z0-9+&@#\\/%=~_|]";

         this.mentions = getMatches(mentionRegex, tweet);
         this.topics = getMatches(hashtagRegex, tweet);
         this.references = getMatches(urlRegex, tweet);
     }

     private String[] getMatches(String regex, String input) {
         List<String> list = new ArrayList<String>();
         Matcher m = Pattern.compile(regex).matcher(input);
         while (m.find()) {
             list.add(m.group());
         }
         String[] array = new String[list.size()];
         list.toArray(array);
         return array;
     }

     public String getTweet() {
         return tweet;
     }

     public String[] getMentions() {
         return mentions;
     }

     public String[] getReferences() {
         return references;
     }

     public String[] getTopics() {
         return topics;
     }

 }
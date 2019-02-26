package com.twittermessagingengine2;

import org.junit.After;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

public class EngineTest {

    /*
    private Engine fixture;

    @After
    public void tearDown() {
        fixture = null;
    }

    @Test //Test to make sure message return value is correct
    public void testMessage() {
        fixture = new Engine("This is my message.");
        String output = fixture.getMessage();
        assertNotNull(fixture);
        assertEquals("This is my message.", output);
    }

    @Test //Test to make sure tweet length is at 280 characters or below
    public void testIsCorrectLength() {
        fixture = new Engine("Test length.");
        Boolean output = fixture.isCorrectLength();
        assertTrue(output);
    }

    @Test //Test to make sure single mention is returned
    public void testDetectMentions() {
        fixture = new Engine("@Dexter");
        String[] output = fixture.detectMentions();
        assertNotNull(fixture);
        assertEquals("@Dexter", output[0]);
    }


    @Test //Test to make sure single topic is returned
    void testDetectTopics() {
        fixture = new Engine("#Eric");
        String[] output = fixture.detectTopics();
        assertNotNull(fixture);
        assertEquals("#Eric", output[0]);
    }


    @Test //Test to make sure single topic is returned
    void testDetectUrls() {
        fixture = new Engine("www.luc.edu");
        String[] output = fixture.detectUrls();
        assertNotNull(fixture);
        assertEquals("www.luc.edu", output[0]);
    }

    @Test //Test to return mentions with spaces
    void testMentionsWithSpaces() {
        fixture = new Engine(" @Eric ");
        String[] output = fixture.detectMentions();
        assertNotNull(fixture);
        assertEquals("@Eric", output[0]);
    }

    @Test //Test to return topics with spaces
    void testTopicsWithSpaces() {
        fixture = new Engine(" #LoyolaUniversity ");
        String[] output = fixture.detectTopics();
        assertNotNull(fixture);
        assertEquals("#LoyolaUniversity", output[0]);
    }

    @Test //Test to return Urls with spaces
    void testUrlsWithSpaces() {
        fixture = new Engine(" www.google.com ");
        String[] output = fixture.detectUrls();
        assertNotNull(fixture);
        assertEquals("www.google.com", output[0]);
    }

    @Test //Test that mutiple mentions are returned correctly
    void testMultipleMentions() {
        fixture = new Engine("@Eric @Dexter");
        String[] output = fixture.detectMentions();
        assertNotNull(fixture);
        assertEquals("@Eric", output[0]);
        assertEquals("@Dexter", output[1]);

    }

    @Test //Test that mutiple topics are returned correctly
    void testMultipleTopics() {
        fixture = new Engine("#software #engineering");
        String[] output = fixture.detectTopics();
        assertNotNull(fixture);
        assertEquals("#software", output[0]);
        assertEquals("#engineering", output[1]);

    }

    @Test //Test that mutiple urls are returned correctly
    void testMultipleUrls() {
        fixture = new Engine("www.amazon.com www.yahoo.com");
        String[] output = fixture.detectUrls();
        assertNotNull(fixture);
        assertEquals("www.amazon.com", output[0]);
        assertEquals("www.yahoo.com", output[1]);

    }

    @Test //Test that mentions with messages are returned correctly
    void testMentionsWithMessage() {
        fixture = new Engine("@George this is a test tweet");
        String[] output = fixture.detectMentions();
        assertNotNull(fixture);
        assertEquals("@George", output[0]);
    }

    @Test //Test that topics with messages are returned correctly
    void testTopicsWithMessage() {
        fixture = new Engine("this project is for COMP 330 #programming");
        String[] output = fixture.detectTopics();
        assertNotNull(fixture);
        assertEquals("#programming", output[0]);
    }

    @Test //Test that urls with messages are returned correctly
    void testUrlsWithMessage() {
        fixture = new Engine("Go to www.youtube.com to watch videos.");
        String[] output = fixture.detectUrls();
        assertNotNull(fixture);
        assertEquals("www.youtube.com", output[0]);
    }

    @Test //Test that mentions with other identifiers are returned correctly
    void testMixedMentions() {
        fixture = new Engine("@Dexter #Eric www.ebay.com");
        String[] output = fixture.detectMentions();
        assertNotNull(fixture);
        assertEquals("@Dexter", output[0]);
    }

    @Test //Test that topics with other identifiers are returned correctly
    void testMixedTopics() {
        fixture = new Engine("@Dexter #Eric www.ebay.com");
        String[] output = fixture.detectTopics();
        assertNotNull(fixture);
        assertEquals("#Eric", output[0]);
    }

    @Test //Test that urls with other identifiers are returned correctly
    void testMixedUrls() {
        fixture = new Engine("@Dexter #Eric www.ebay.com");
        String[] output = fixture.detectUrls();
        assertNotNull(fixture);
        assertEquals("www.ebay.com", output[0]);
    }

    @Test //Test that mentions with other identifiers and a message are returned correctly
    void testMixedMentionsWithMessage() {
        fixture = new Engine("@Zac #George www.reddit.com This is my message.");
        String[] output = fixture.detectMentions();
        assertNotNull(fixture);
        assertEquals("@Zac", output[0]);
    }

    @Test //Test that topics with other identifiers and a message are returned correctly
    void testMixedTopicsWithMessage() {
        fixture = new Engine("@Zac #George www.reddit.com This is my message.");
        String[] output = fixture.detectTopics();
        assertNotNull(fixture);
        assertEquals("#George", output[0]);
    }

    @Test //Test urls mentions with other identifiers and a message are returned correctly
    void testMixedUrlsWithMessage() {
        fixture = new Engine("@Zac #George www.reddit.com This is my message.");
        String[] output = fixture.detectUrls();
        assertNotNull(fixture);
        assertEquals("www.reddit.com", output[0]);
    }
    */
}

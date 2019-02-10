package com.twittermessagingengine2;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;  // is this needed?

public class EngineTest {

    private Engine fixture;

    @Before
    public void setup() {
        fixture = new Engine();
    }

    @After
    public void tearDown() {
        fixture = null;
    }

    @Test //Test to make sure message return value is correct
    public void testMessage() {
        String output = fixture.getMessage("This is my message.");
        assertNotNull(fixture);
        assertEquals("This is my message.", output);
    }

    @Test //Test to make sure tweet length is at 280 characters or below
    public void testIsCorrectLength() {
        Boolean output = fixture.isCorrectLength("test");
        assertTrue(output);
    }

    @Test //Test to make sure single mention is returned
    public void testDetectMentions() {
        String[] output = fixture.detectMentions("@Dexter");
        assertNotNull(fixture);
        assertEquals("@Dexter", output[0]);
    }


    @Test //Test to make sure single topic is returned
    void testDetectTopics() {
        String[] output = fixture.detectTopics("#Eric");
        assertNotNull(fixture);
        assertEquals("#Eric", output[0]);
    }


    @Test //Test to make sure single topic is returned
    void testDetectUrls() {
        String[] output = fixture.detectUrls("www.luc.edu");
        assertNotNull(fixture);
        assertEquals("www.luc.edu", output[0]);
    }

    @Test //Test to return mentions with spaces
    void testMentionsWithSpaces() {
        String[] output = fixture.detectMentions(" @Eric ");
        assertNotNull(fixture);
        assertEquals("@Eric", output[0]);
    }

    @Test //Test to return topics with spaces
    void testTopicsWithSpaces() {
        String[] output = fixture.detectTopics(" #LoyolaUniversity ");
        assertNotNull(fixture);
        assertEquals("#LoyolaUniversity", output[0]);
    }

    @Test //Test to return Urls with spaces
    void testUrlsWithSpaces() {
        String[] output = fixture.detectUrls(" www.google.com ");
        assertNotNull(fixture);
        assertEquals("www.google.com", output[0]);
    }

    @Test //Test that mutiple mentions are returned correctly
    void testMultipleMentions() {
        String[] output = fixture.detectMentions("@Eric @Dexter");
        assertNotNull(fixture);
        assertEquals("@Eric", output[0]);
        assertEquals("@Dexter", output[1]);

    }

    @Test //Test that mutiple topics are returned correctly
    void testMultipleTopics() {
        String[] output = fixture.detectTopics("#software #engineering");
        assertNotNull(fixture);
        assertEquals("#software", output[0]);
        assertEquals("#engineering", output[1]);

    }

    @Test //Test that mutiple urls are returned correctly
    void testMultipleUrls() {
        String[] output = fixture.detectUrls("www.amazon.com www.yahoo.com");
        assertNotNull(fixture);
        assertEquals("www.amazon.com", output[0]);
        assertEquals("www.yahoo.com", output[1]);

    }

    @Test //Test that mentions with messages are returned correctly
    void testMentionsWithMessage() {
        String[] output = fixture.detectMentions("@George this is a test tweet");
        assertNotNull(fixture);
        assertEquals("@George", output[0]);
    }

    @Test //Test that topics with messages are returned correctly
    void testTopicsWithMessage() {
        String[] output = fixture.detectTopics("this project is for COMP 330 #programming");
        assertNotNull(fixture);
        assertEquals("#programming", output[0]);
    }

    @Test //Test that urls with messages are returned correctly
    void testUrlsWithMessage() {
        String[] output = fixture.detectUrls("Go to www.youtube.com to watch videos.");
        assertNotNull(fixture);
        assertEquals("www.youtube.com", output[0]);
    }

    @Test //Test that mentions with other identifiers are returned correctly
    void testMixedMentions() {
        String[] output = fixture.detectMentions("@Dexter #Eric www.ebay.com");
        assertNotNull(fixture);
        assertEquals("@Dexter", output[0]);
    }

    @Test //Test that topics with other identifiers are returned correctly
    void testMixedTopics() {
        String[] output = fixture.detectTopics("@Dexter #Eric www.ebay.com");
        assertNotNull(fixture);
        assertEquals("#Eric", output[0]);
    }

    @Test //Test that urls with other identifiers are returned correctly
    void testMixedUrls() {
        String[] output = fixture.detectUrls("@Dexter #Eric www.ebay.com");
        assertNotNull(fixture);
        assertEquals("www.ebay.com", output[0]);
    }

    @Test //Test that mentions with other identifiers and a message are returned correctly
    void testMixedMentionsWithMessage() {
        String[] output = fixture.detectMentions("@Zac #George www.reddit.com This is my message.");
        assertNotNull(fixture);
        assertEquals("@Zac", output[0]);
    }

    @Test //Test that topics with other identifiers and a message are returned correctly
    void testMixedTopicsWithMessage() {
        String[] output = fixture.detectTopics("@Zac #George www.reddit.com This is my message.");
        assertNotNull(fixture);
        assertEquals("#George", output[0]);
    }

    @Test //Test urls mentions with other identifiers and a message are returned correctly
    void testMixedUrlsWithMessage() {
        String[] output = fixture.detectUrls("@Zac #George www.reddit.com This is my message.");
        assertNotNull(fixture);
        assertEquals("www.reddit.com", output[0]);
    }
}

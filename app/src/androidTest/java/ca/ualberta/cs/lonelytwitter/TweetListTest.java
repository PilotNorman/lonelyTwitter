package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


/**
 * Created by watts1 on 1/28/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }


    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Tweet");
        tweets.add(tweet);
        try {
            tweets.add(tweet);
            fail();
        }catch(IllegalArgumentException e){}
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet1 = new NormalTweet("test tweet1");
        TimeUnit.SECONDS.sleep(3);
        Tweet tweet2 = new NormalTweet("test tweet2");
        TimeUnit.SECONDS.sleep(3);
        Tweet tweet3 = new NormalTweet("test tweet3");
        TimeUnit.SECONDS.sleep(3);
        Tweet tweet4 = new NormalTweet("test tweet4");
        TimeUnit.SECONDS.sleep(3);
        tweets.add(tweet2);
        tweets.add(tweet1);
        tweets.add(tweet4);
        tweets.add(tweet3);

        ArrayList<Tweet> sortedTweetList = tweets.getTweets();
        int i;
        for (i = 1; i < sortedTweetList.size(); i++){
            assertTrue(sortedTweetList.get(i-1).getDate().before(sortedTweetList.get(i).getDate()));
        }
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testgetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Test Tweet1");
        Tweet tweet2 = new NormalTweet("Test Tweet2");

        assertEquals(tweets.getCount(), 0);
        tweets.add(tweet1);
        assertEquals(tweets.getCount(), 1);
        tweets.add(tweet2);
        assertEquals(tweets.getCount(), 2);

        tweets.delete(tweet1);
        assertEquals(tweets.getCount(), 2);
        tweets.delete(tweet2);
        assertEquals(tweets.getCount(), 1);

    }


}

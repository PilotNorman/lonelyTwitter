package ca.ualberta.cs.lonelytwitter;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by watts1 on 1/28/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int i=0;

    public void add(Tweet tweet){

        if (hasTweet(tweet)){
            throw new IllegalArgumentException();
        }

        tweets.add(tweet);
        i+=1;
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
        i=0;
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public int getCount(){
        return tweets.size();
    }

    class TweetDateComp implements Comparator<Tweet> {

        public int compare(Tweet t1, Tweet t2) {
            if(t1.getDate().before(t2.getDate())){
                return -1;
            } else {
                return 1;
            }
        }
    }

    public ArrayList<Tweet> getTweets(){
        Log.d("tweettag",tweets.toString());
        Collections.sort(tweets, new TweetDateComp());
        Log.d("tweettag",tweets.toString());
        return tweets;
    }

}

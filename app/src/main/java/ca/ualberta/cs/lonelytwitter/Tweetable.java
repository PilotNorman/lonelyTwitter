package ca.ualberta.cs.lonelytwitter;

/**
 * Created by yipeng6 on 1/19/17.
 * Check whether the tweet is tweetable
 * @author yipengzhou
 * @version 1.4.2
 * @since 1.0
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}

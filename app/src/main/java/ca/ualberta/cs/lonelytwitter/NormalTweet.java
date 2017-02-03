package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yipeng6 on 1/19/17.
 *
 * An normal tweet class is a class which can let the
 * user to choose whether the tweet is normal.
 *
 * <p><code>NormalTweet/</code></p>
 * For writing important tweets, consider using
 * <code>ImportantTweet</code>
 *
 * @author yipengzhou
 * @version 1.4.2
 * @since 1.0
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * Determine whether the tweet is important
     * @return false
     */

    @Override
    public Boolean isImportant(){
        return false;
    }
}

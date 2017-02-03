package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yipeng6 on 1/19/17.
 *
 * An important tweet class is a class which can let the
 * user to choose whether the tweet is important.
 *
 * <p><code>ImportantTweet/</code></p>
 * For writing normal tweets, consider using
 * <code>NormalTweet</code>
 *
 * @author yipengzhou
 * @version 1.4.2
 * @since 1.0
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
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

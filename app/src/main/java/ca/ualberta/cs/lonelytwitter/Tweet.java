package ca.ualberta.cs.lonelytwitter;

import java.security.PublicKey;
import java.util.Date;
/**
 * Created by yipeng6 on 1/19/17.
 * A tweet class is a abstract class which define how does
 * a tweet looks like.
 *<ul>
 *    <li>date</li>
 *    <li>message</li>
 *</ul>
 * @author yipengzhou
 * @version 1.4.2
 * @since 1.0
 */


public abstract class Tweet implements Tweetable{

    private Date date;
    private String message;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Tweet(String message){
        this.message =message;
        this.date=new Date();
    }

    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length()>140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + "|" + message;
    }
}

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Juan on 17/09/2015.
 */
public class Post {
    private String topic;
    private Calendar dateCreated;
    private Calendar lastUpdate;
    private boolean isAllowed;
    private ArrayList<File> attachments;
    private String text;
    private ArrayList<Integer> ratings;
    private  int rated;

    public Post(String topic, Calendar dateCreated, Calendar lastUpdate, boolean isAllowed) {
        this.topic = topic;
        this.dateCreated = dateCreated;
        this.lastUpdate = lastUpdate;
        this.isAllowed = isAllowed;
        this.attachments = new ArrayList<File>();
        this.ratings = new ArrayList<Integer>();
        this.rated = 0;
    }

    public void  comment (Post post, String text){
        post.comment(text);
    }

    private void comment(String text){
        this.text = text;
    }

    public void rate(int rated){
        ratings.add(rated);
        int sum = 0;
        for (int i = 0; i < this.ratings.size(); i++){
            sum += ratings.get(i);
        }
        int avg = sum/ratings.size();
        this.rated = avg;
    }

    public void share(){

    }

    public int getRated(int index){
        return this.ratings.get(index);
    }

    public File getAttachFile(File file){
        return this.attachments.get(this.attachments.indexOf(file));
    }

    public String getText() {
        return text;
    }

    public int getRated() {
        return rated;
    }

    public void attachFile(File attachment) {
        this.attachments.add(attachment);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }
}

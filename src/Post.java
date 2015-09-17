import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Juan on 16/09/2015.
 */
public class Post {
    private String topic;
    private Date dateCreated;
    private Date lastUpdate;
    private boolean isAllowed;
    private ArrayList<File> attachments;

    public Post(String topic, Date dateCreated, Date lastUpdate, boolean isAllowed) {
        this.topic = topic;
        this.dateCreated = dateCreated;
        this.lastUpdate = lastUpdate;
        this.isAllowed = isAllowed;
        this.attachments = new ArrayList<File>();
    }

    public void attachFile(File attachment){
        attachments.add(attachment);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }
}

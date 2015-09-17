import java.util.Date;
import java.util.Vector;

public class Forum {

    private String name;
    private Date dateCreated;
    private String category;
    private Vector<Post> forumPosts;

    public Forum(String name, Date dateCreated, String category) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

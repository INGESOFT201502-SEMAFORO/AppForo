import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

public class Forum {

    private String name;
    private Calendar dateCreated;
    private String category;
    private ArrayList<Post> forumPosts;

    public Forum(String name, Calendar dateCreated, String category) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.category = category;
        this.forumPosts = new ArrayList<Post>();
    }

    public void addPost(Post post){
        this.forumPosts.add(post);
    }

    public ArrayList<Post> getForumPosts() {
        return forumPosts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "category='" + category + '\'' +
                ", dateCreated=" + dateCreated +
                ", name='" + name + '\'' +
                '}';
    }
}

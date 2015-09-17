import java.util.ArrayList;

/**
 * Created by David Alexander on 17/09/2015.
 */
public class Regular extends User {

    private int postViews;
    private int strikesNumber;
    private int starsNumber;
    private ArrayList<Post> posts;

    public Regular(String name, String lastname, int age, String username, String password, int postViews, int strikesNumber, int starsNumber) {
        super(name, lastname, age, username, password);
        this.postViews = postViews;
        this.strikesNumber = strikesNumber;
        this.starsNumber = starsNumber;
        this.posts = new ArrayList<Post>();
    }

    public void addPost(Post post){
        this.posts.add(post);
    }

    public Post getPost(int index){
        return this.posts.get(index);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public int getPostViews() {

        return postViews;
    }

    public void setPostViews(int postViews) {

        this.postViews = postViews;
    }

    public int getStrikesNumber() {

        return strikesNumber;
    }

    public void setStrikesNumber(int strikesNumber) {

        this.strikesNumber = strikesNumber;
    }

    public int getStarsNumber() {

        return starsNumber;
    }

    public void setStarsNumber(int starsNumber) {

        this.starsNumber = starsNumber;
    }
}
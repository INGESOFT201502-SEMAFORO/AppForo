public class Admin extends User {
    private int level;
    private double rating;

    public Admin(int level, double rating) {
        this.level = level;
        this.rating = rating;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

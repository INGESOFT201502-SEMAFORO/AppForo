/**
 * Created by SamuelLeonardo on 17/09/2015.
 */
public class User {
    private String name;
    private String lastname;
    private int age;
    private String username;
    private String password;

    public User() {
    }

    public User(String name, String lastname, int age, String username, String password) {
        this.name = name; this.lastname = lastname;
        this.age = age; this.username = username; this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

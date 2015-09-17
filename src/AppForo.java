import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Juan on 17/09/2015.
 */
public class AppForo {

    public static void main (String[] args){
        Admin administrador = new Admin("Juan", "Arias", 22, "jpariasc", "1234", 0, 0.0);
        Regular usuario1 = new Regular("Sergio", "Gabalan", 22, "segabalanv", "2468", 0,0,0);
        Regular usuario2 = new Regular("David", "Rubio", 22, "darubiob", "3691", 0,0,0);
        Regular usuario3 = new Regular("Samuel", "Perez", 22, "asdfrsg", "3691", 0,0,0);
        Regular usuario4 = new Regular("Cesar", "Silva", 22, "dsgsegr", "3691", 0,0,0);


        Post post1 = new Post("programacion", Calendar.getInstance(Locale.ENGLISH),Calendar.getInstance(Locale.ENGLISH), true);
        Post post2 = new Post("programacion", Calendar.getInstance(Locale.ENGLISH),Calendar.getInstance(Locale.ENGLISH), true);


        usuario1.addPost(post1);
        usuario1.addPost(post2);

        Forum foro1 =  new Forum("Windows10", Calendar.getInstance(Locale.ENGLISH), "SO");
        administrador.addForum(foro1);

        foro1.addPost(post1);
        foro1.addPost(post2);

        System.out.print("foro1: " + foro1.toString());
        System.out.print("posts: " + foro1.getForumPosts().toString());


    }
}

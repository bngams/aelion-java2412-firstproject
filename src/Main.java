import models.Client;
import models.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("My args are:");
        // parcours du tableau avec foreach /!\ au cas d'utilisation / perf.
        for (String arg : args) {
            System.out.println(arg);
        }

        User u1 = new User();
        User u2 = new User("Boris");
        User u3 = new User("Boris", "boris@mail.com");
        System.out.println("User 1 is " + u1.getName());

        Client c1 = new Client();
        c1.setName("Boris");
    }
}
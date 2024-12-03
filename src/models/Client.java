package models;

public class Client extends User {

    public Client() {
        // super implicit
        // super(); // constructeur User()
    }

    public Client(String email) {
        super("unknown", email); // constructeur User(...)
    }

    public Client(String name, String email) {
        super(name, email); // constructeur User(...)
    }
}

package models;

public class User {
    private String name;
    private String email;

    public User () {
        // this.name = "unknown";
        // this.email = "unknown";

        // we can call another constructor
        this("unknown", "unknown");
    }

    public User (String name) {
        // this.name = name;
        // this.email = "unknown";

        // we can call another constructor
        this(name, "unknown");
    }

    public User (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        // no return ... => void
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

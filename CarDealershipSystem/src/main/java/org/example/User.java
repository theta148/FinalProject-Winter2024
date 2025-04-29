package org.example;

import java.util.Objects;

public abstract class User {
    private String name;
    private String email;
    private String id; // consists of a letter and 3 numbers.

    public User() {
        this.name = "";
        this.email = "";
        this.id = "";
    }

    public User(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public abstract void accessSystem();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, id);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

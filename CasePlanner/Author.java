package CasePlanner;

public class Author {
    String name;
    String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Overrides the default toString() method to return a string representation of the Author object.
    @Override
    public String toString() {
        return "Author: " + "Name: " + name + ", Surname: " + surname;
    }
}
package CasePlanner;

public class Author {
    String name;
    String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author: " +
                "Name: " + name  +
                ", Surname: " + surname;
    }
}

package CasePlanner;

public abstract class Case {
    public int id;
    public Author author;
    public String title;

    public String description;

    public void showInfo() {
        System.out.println("Task: " + title);
        System.out.println("Author: " + author.toString());
        System.out.println("Description: " + description);
    }

    public enum Status{
        InProgress,
        Done
    }
}

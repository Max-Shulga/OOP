package CasePlanner;

/**
 * Abstract class representing a task or case in the Case Planner application.
 * Each task has an ID, an author (represented by the Author class), a title, and a description.
 * It also has a method to display information about the task, and an enum representing its status.
 */
public abstract class Case {
    public int id;
    public Author author;
    public String title;
    public String description;

    /**
     * Displays information about the task, including its title, author, and description.
     */
    public void showInfo() {
        System.out.println("Task: " + title);
        System.out.println("Author: " + author.toString());
        System.out.println("Description: " + description);
    }

    /**
     * Enum representing the status of the task.
     */
    public enum Status {
        InProgress,
        Done
    }
}

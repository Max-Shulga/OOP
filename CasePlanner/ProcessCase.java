package CasePlanner;
/**
 * The ProcessCase class represents a task that needs to be completed.
 * It extends the Case class and adds additional properties like a deadline,
 * a priority level, and an author.
 */

import java.time.Duration;
import java.time.LocalDateTime;


public class ProcessCase extends Case {
    // The static id field is incremented every time a new ProcessCase object is created

    private static int id;

    static {
        id = 0;
    }

    private final Author author;
    LocalDateTime deadline;
    String title;
    String description;
    Status status;
    private Priority priority;

    /**
     * Constructor for creating a new ProcessCase object with a given title and author name and surname.
     * Initializes the id and author fields and sets the status to InProgress.
     *
     * @param title - the title of the task
     * @param name - the name of the author
     * @param surname - the surname of the author
     */
    public ProcessCase(String title, String name, String surname) {
        getID();
        this.title = title;
        this.author = new Author(name, surname);
        this.status = Status.InProgress;
    }

    /**
     * Getter for the title field.
     *
     * @return the title of the task
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for the title field.
     *
     * @param title - the new title of the task
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Setter for the description field.
     *
     * @param description - the new description of the task
     */
    /**
     * Setter for the description field.
     *
     * @param description - the new description of the task
     */
    public void setDescription(String description) {

        this.description = description;
    }

    /**
     * Getter for the description field.
     *
     * @return the description of the task
     */
    public void getDescription() {

        System.out.println(description);
    }

    /**
     * Private method for incrementing the id field.
     */
    private void getID() {

        id++;
    }

    /**
     * Getter for the id field.
     *
     * @return the id of the task
     */
    public int getId() {

        return id;
    }

    /**
     * Prints the id of the task.
     */
    public void showId() {
        System.out.println(this.getId());
    }

    /**
     * Prints the deadline of the task.
     */
    public void showDeadline() {
        System.out.println(this.deadline);
    }

    /**
     * Prints the description of the task.
     */
    public void showDescription() {
        System.out.println(this.description);
    }

    /**
     * Prints the priority level of the task.
     */
    public void showPriority() {
        System.out.println(this.priority);
    }

    /**
     * Prints the title of the task.
     */
    public void showTitle() {
        System.out.println(this.title);
    }

    /**
     * Prints the author of the task.
     */
    public void showAuthor() {
        System.out.println(this.author.toString());
    }

    /**
     * Sets the deadline of the task with a specific date and time.
     * Also sets the priority level based on the remaining time until the deadline.
     *
     * @param year - the year of the deadline
     * @param month - the month of the deadline
     * @param day - the day of the deadline
     * @param hour - the hour of the deadline
     * @param minute - the minute of the deadline
     */
    public void setDeadline(int year, int month, int day, int hour, int minute) {
        this.deadline = LocalDateTime.of(year, month, day, hour, 0);
        setPriority();
    }

    public void setDeadline(int year, int month, int day, int hour) {
        this.deadline = LocalDateTime.of(year, month, day, hour, 0, 0);
        setPriority();
    }

    public void setDeadline(int year, int month, int day) {
        this.deadline = LocalDateTime.of(year, month, day, 0, 0, 0);
        setPriority();
    }

    private void setPriority() {
        Duration remaining = getRemainingTime();
        long remainingDays = Math.abs(remaining.toDays());
        System.out.println(remainingDays);
        if (remainingDays < 3) {
            this.priority = Priority.High;
        } else if (remainingDays < 7) {
            this.priority = Priority.Middle;
        } else if (remainingDays > 14) {
            this.priority = Priority.Low;
        }
    }

    public Duration getRemainingTime() {
        LocalDateTime currentDate = LocalDateTime.now();
        return Duration.between(currentDate, this.deadline);
    }

    public void getTaskTime() {
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(Duration.between(currentDate, this.deadline));
    }

    public Author getAuthor() {
        return this.author;
    }

    public void showInfo() {
        System.out.println("Case №: " + id + "{Title='" + this.title + '\'' + ", Priority: " + this.priority + ", " + this.author.toString() + ", Deadline: " + this.deadline + ", Description:'" + this.description + '\'' + '}');
    }

    public enum Priority {
        Low, Middle, High
    }
}

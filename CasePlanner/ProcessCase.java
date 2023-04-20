package CasePlanner;


import java.time.Duration;
import java.time.LocalDateTime;


public class ProcessCase extends Case {
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

    public ProcessCase(String title, String name, String surname) {
        getID();
        this.title = title;
        this.author = new Author(name, surname);
        this.status = Status.InProgress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void getDescription() {
        System.out.println(description);
    }

    private void getID() {
        id++;
    }

    public int getId() {
        return (int) id;
    }
    public void showId(){
        System.out.println(this.getId());
    }
    public void showDeadline(){
        System.out.println(this.deadline);
    }
    public void showDescription(){
        System.out.println(this.description);
    }
    public void showPriority(){
        System.out.println(this.priority);
    }
    public void showTitle(){
        System.out.println(this.title);
    }
    public void showAuthor(){
        System.out.println(this.author.toString());
    }

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

package CasePlanner;

import java.time.LocalDateTime;
// The DoneCases class represents a case that has been completed

public class DoneCases extends Case {
    // The time the task was completed

    LocalDateTime closeTaskTime;
    // Method for closing a task

    public void closeTask(ProcessCase task){
        // Set the id, author, title, and description of the completed task to the same values as the original task

        this.id = task.getId();
        this.author = task.getAuthor();
        this.title = task.title;
        this.description = task.description;
        // Set the time the task was completed to the current time
        this.closeTaskTime = LocalDateTime.now();
    }
}

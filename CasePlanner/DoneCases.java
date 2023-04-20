package CasePlanner;

import java.time.LocalDateTime;

public class DoneCases extends Case {

    LocalDateTime closeTaskTime;

    public void closeTask(ProcessCase task){
        this.id = task.getId();
        this.author = task.getAuthor();
        this.title = task.title;
        this.description = task.description;
        this.closeTaskTime = LocalDateTime.now();
    }


}

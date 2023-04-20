package CasePlanner;

public class CasePlanner<T extends ProcessCase> {
    // Private instance variable to store the planner name
    private String plannerName;

    // Constructor to initialize the planner name and the different archives
    public CasePlanner(String plannerName) {
        // Set the planner name using the provided argument
        setPlannerName(plannerName);

        // Initialize the current tasks archive
        currentTasks = new CurrentCasesArchive<T>();

        // Initialize the done tasks archive
        archive = new DoneCasesArchive<T>();

        // Initialize the done tasks archive without generics (for cases where T cannot be used)
        done = new DoneCases();
    }

    // Getter method to retrieve the planner name
    public String getPlannerName() {
        return plannerName;
    }

    // Setter method to set the planner name
    public void setPlannerName(String plannerName) {
        this.plannerName = plannerName;
    }

    // Private instance variables to store the current tasks archive, done tasks archive, and done tasks
    CurrentCasesArchive<T> currentTasks;
    DoneCasesArchive<T> archive;
    DoneCases done;

    // Public method to add a new task to the current tasks archive
    public void addTask(T task){
        currentTasks.addTask(task);
    }

    // Public method to close a task with the given id
    public void closeTask(int id){
        // Retrieve the task with the given id from the done tasks archive
        T task = archive.showCase(id);

        // Set the task's status to Done
        task.status = ProcessCase.Status.Done;

        // Move the task from the current tasks archive to the done tasks archive
        currentTasks.removeTask(task);
        archive.addTask(task);

        // Add the task to the done tasks archive (without generics)
        done.closeTask(task);
    }
}



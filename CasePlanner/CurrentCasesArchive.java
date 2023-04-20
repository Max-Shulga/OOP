package CasePlanner;


/**
 * A class that represents an archive of current cases. Extends the Archive class with a priority sorting mechanism based
 * on remaining time of the cases.
 *
 * @param <T> the type of case to be stored in the archive, must extend the ProcessCase class.
 */
public class CurrentCasesArchive<T extends ProcessCase> extends Archive<T> {

    /**
     * Sorts the archive by remaining time of the cases in ascending order.
     */
    private void prioritySort() {
        archive.sort((T task1, T task2) -> task1.getRemainingTime().compareTo(task2.getRemainingTime()));
    }

    /**
     * Adds a task to the archive and sorts the archive by priority.
     *
     * @param task the task to be added to the archive.
     */
    @Override
    public void addTask(T task) {
        archive.add(task);
        this.prioritySort();
    }
}

package CasePlanner;


import java.util.Comparator;

public class CurrentCasesArchive<T extends ProcessCase> extends Archive<T>{

    private void prioritySort() {
        archive.sort((T task1, T task2)-> task1.getRemainingTime().compareTo(task2.getRemainingTime()));
            }

    @Override
    public void addTask(T task) {
        archive.add(task);
        this.prioritySort();
    }
}

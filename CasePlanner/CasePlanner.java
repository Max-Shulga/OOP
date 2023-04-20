package CasePlanner;

public class  CasePlanner<T extends ProcessCase> {
    private String PlannerName;
    public CasePlanner(String PlannerName) {
        setPlannerName(PlannerName);
        currentTasks = new CurrentCasesArchive<T>();
        archive = new DoneCasesArchive<T>();
        done = new DoneCases();
    }

    public String getPlannerName() {
        return PlannerName;
    }

    public void setPlannerName(String plannerName) {
        this.PlannerName = plannerName;
    }

    CurrentCasesArchive<T> currentTasks;
    DoneCasesArchive<T> archive;
    DoneCases done;
    public void addTask(T task){
        currentTasks.addTask(task);
    }
    public void closeTask(int id){
        T task = archive.showCase(id);
        task.status = ProcessCase.Status.Done;
        done.closeTask(task);
        currentTasks.removeTask(task);
        archive.addTask(task);
    }
}



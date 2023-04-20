package CasePlanner;

public class DoneCasesArchive<T extends ProcessCase> extends Archive<T >{
    public void closeTask(T task){};
}

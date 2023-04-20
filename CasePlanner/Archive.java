package CasePlanner;

import java.util.ArrayList;

public class Archive<T extends ProcessCase> {

    public ArrayList<T> archive = new ArrayList<>();
    public T showCase(int id){
        for (T task : archive) {
            if (task.getId() == id){
                return  task;
            }
        }
        return null;
    }

    public void showTitles() {
        for (T title : archive) {
            System.out.println(title.title);
        }
    }
    public void showAll() {
        for (T task : archive) {
            task.showInfo();
        }
    }
    public void addTask(T task){
        archive.add(task);
    }
    public void removeTask(T task){
        archive.remove(task);
    }
}

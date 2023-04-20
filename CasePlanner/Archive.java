package CasePlanner;

import java.util.ArrayList;

// Archive class that stores and manages a collection of ProcessCase objects
public class Archive<T extends ProcessCase> {

    // ArrayList to store the ProcessCase objects
    public ArrayList<T> archive = new ArrayList<>();

    // Method to retrieve a ProcessCase object with a specific ID from the archive
    public T showCase(int id) {
        for (T task : archive) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    // Method to print out the titles of all the ProcessCase objects in the archive
    public void showTitles() {
        for (T title : archive) {
            System.out.println(title.title);
        }
    }

    // Method to print out all the information of all the ProcessCase objects in the archive
    public void showAll() {
        for (T task : archive) {
            task.showInfo();
        }
    }

    // Method to add a ProcessCase object to the archive
    public void addTask(T task) {
        archive.add(task);
    }

    // Method to remove a ProcessCase object from the archive
    public void removeTask(T task) {
        archive.remove(task);
    }
}

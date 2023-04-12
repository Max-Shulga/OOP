package Personas;

import java.util.ArrayList;
import java.util.Scanner;

public class Cupboard {
    ArrayList<String> items;

    public void openCupboard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose option");
        System.out.println("1.Put in item \n 2.Pull out");
        int choice = scan.nextInt();
        if (choice == 1) {
            putInItem(scan);
        } else if (choice == 2) {
            pullOutItem(scan);
        }

    }

    private void putInItem(Scanner scan) {
        System.out.println("What item do you want to put in?");
        String item = scan.next();
        putIn(item);
    }

    private void pullOutItem(Scanner scan) {
        System.out.println("What item do you want to pull out?");
        String item = scan.next();
        pullOut(item);
    }

    private void putIn(String item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
        System.out.println(item + " was added to the cupboard.");
    }

    private void pullOut(String item) {
        if (items == null) {
            System.out.println("The cupboard is empty.");
            return;
        }
        if (items.contains(item)) {
            items.remove(item);
            System.out.println(item + " was removed from the cupboard.");
        } else {
            System.out.println(item + " was not found in the cupboard.");
        }
    }
    private void itemInBoard(){
        System.out.println(items);
    }
}

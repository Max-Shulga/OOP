package CasePlanner;

import java.util.Scanner;

public class Input{
    public Input() {
    }

    public String scanStr(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public int scanInt(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int scanInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}

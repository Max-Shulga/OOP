package CasePlanner;

import java.util.Scanner;
/**

 The Input class is used for reading user input from the console.
 */

public class Input{

    public Input() {
    }
    /**
     * Reads a String input from the user with a prompt.
     *
     * @param title the prompt to display to the user
     * @return the String input read from the user
     */
    public String scanStr(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    /**
     * Reads an integer input from the user with a prompt.
     *
     * @param title the prompt to display to the user
     * @return the integer input read from the user
     */
    public int scanInt(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    /**
     * Reads an integer input from the user without a prompt.
     *
     * @return the integer input read from the user
     */
    public int scanInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

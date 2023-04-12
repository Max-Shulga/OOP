package Personas;

import java.util.ArrayList;
import java.util.List;

public class Man extends Human{
    ArrayList<String> inheritance;
    private int capital;


    public Man(String firstName, int age) {
        super(firstName, age);
    }

    public Man(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public Man() {
    }

    public ArrayList<String> getInheritance() {
        return inheritance;
    }

    public void setInheritance(String args) {
        inheritance = new ArrayList<>();
        inheritance.addAll(List.of(args.split(",")));
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
    public void showInfo(){
        System.out.println("{" +
                "firstName: '" + firstName + '\'' +
                ", secondName: '" + secondName + '\'' +
                ", age: " + age +
                ", birthdate: " + this.getBirthdate() +
                ", capital: " + capital +
                ", inheritance: "  + inheritance +
                '}');

    }
}

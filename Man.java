import interfaces.getProto;

import java.util.ArrayList;
import java.util.List;

public class Man  extends Human implements getProto {
    Relations relations = new Relations(this);

    private static int defaultIndex;
    static {
        defaultIndex = 1;
    }
    public int power;
    ArrayList<String> inheritance;



    public Man(String firstName, int age) {
        super(firstName, age);
    }



    public Man(String firstName, String secondName, int age, int capital) {
        super(firstName, secondName, age);
        this.capital = capital;
    }

    private int capital;

    public Man() {
        this.firstName = "User" + defaultIndex;
        defaultIndex++;
    }


    public void setCapital(int capital) {
        this.capital = capital;
    }

    public void setInheritance(String args) {
        inheritance.addAll(List.of(args.split(",")));
    }


    @Override
    public Object getProto() {
        return this;
    }
}

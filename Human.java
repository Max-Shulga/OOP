import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private static int defaultIndex;

    static {
        defaultIndex = 1;
    }

    String firstName;
    String secondName;
    int age;
    ArrayList<String> inheritance;
    private LocalDate birthdate;


    public Human() {
        this.firstName = "User" + defaultIndex;
        defaultIndex++;
    }

    public Human(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Human(String firstName, String secondName, int age) {
        new Human(firstName, age);
        this.secondName = secondName;
    }



    private void setBirthdate(int year, int month, int day) {
        this.birthdate = LocalDate.of(year, month, day);
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }
    Cupboard cupboard = new Cupboard();
    public void openCupboard(){
        cupboard.openCupboard();
    }



    @Override
    public String toString() {
        return "Human{" +
                "First name: '" + firstName + '\'' +
                ", second name: '" + secondName + '\'' +
                ", Age: " + age +
                ", Birthdate: " + birthdate +
                '}';
    }
}




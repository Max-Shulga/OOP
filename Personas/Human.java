package Personas;

import interfaces.getName;
import interfaces.getProto;

import java.time.LocalDate;

public class Human implements getProto,getName{

    /**
     * @proto Block to create with a base name / Блок для создание с базовым именем
     */
    private static int defaultIndex;

    static {
        defaultIndex = 1;
    }

    String firstName;
    String secondName;
    int age;
    Relations relations = new Relations(getProto());
    Cupboard cupboard = new Cupboard();
    private LocalDate birthdate;

    /**
     * constructors
     */
    public Human(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Human(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }


    public Human() {
        this.firstName = "User" + defaultIndex;
        defaultIndex++;
    }

    public void setBirthdate(int year, int month, int day) {
        this.birthdate = LocalDate.of(year, month, day);
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    @Override
    public String toString() {
        return '{' + firstName + ' ' + secondName + ", age: " + age + '}';
    }

    public Human getProto() {
        return this;
    }


    @Override
    public String MyNameiS() {
        return this.firstName;
    }
}




package Personas;

import interfaces.TakeCare;

public class Woman extends Human implements TakeCare {
    public Woman(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public Woman(String firstName, int age) {
        super(firstName, age);
    }

    public Woman() {
    }


    @Override
    public void caring(Children target) {
        System.out.println("taking care of " + target.firstName);
    }
}

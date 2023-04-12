import interfaces.getProto;

public class Children extends Human implements getProto{


    public Children(String firstName, int age) {
        super(firstName, age);
    }

    public Children(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }


    @Override
    public Children getProto() {
        return this;
    }


}

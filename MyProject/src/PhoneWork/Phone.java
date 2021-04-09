package PhoneWork;

public class Phone {
    private String number;

    public void hello(String name) {
        System.out.printf("hello " + name);
    }

    public Phone(String number) {
        this.number = number;
    }
}

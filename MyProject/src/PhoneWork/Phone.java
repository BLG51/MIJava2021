package PhoneWork;

public class Phone {
    private String number;

    public void hello(String name) {
        System.out.printf("hello " + name);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name );
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name+ " " + number);
    }

    public Phone(String number) {
        this.number = number;
    }
}

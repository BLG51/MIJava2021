package PhoneWork;

public class SmartPhone extends Phone {
    private String username;

    public SmartPhone(String number, String username) {
        super(number);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void hello(String name) {
        System.out.printf("Zdarova " + name);
    }

}

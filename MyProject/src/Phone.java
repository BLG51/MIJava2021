public class Phone {
    private String number;
    private String model;

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public String getNumber(){
        return number;
    }

    public String getModel(){
        return model;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void call(String number) {
        System.out.println("call on number " + number);
    }

}

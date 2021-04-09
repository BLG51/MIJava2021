package PhoneWork;

public class Main {
    public static void main(String[] args) {
        //Создать 3 объекта Phone
        Phone phone_1 =  new Phone("+79503842484");
        Phone phone_2 =  new Phone("+79850862187");
        Phone phone_3 =  new Phone("+79050848484");


        //один SmartPhone
        SmartPhone smartphone = new SmartPhone("+79073842847", "Anton");
//У любого Phone вызвать метод receiveCall("Anton")
        phone_1.receiveCall("Anton");
//Вывести в консоль getNumber() у любого Phone.
        System.out.println( smartphone.getUsername() );

    }
}

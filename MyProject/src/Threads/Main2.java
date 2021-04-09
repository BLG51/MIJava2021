package Threads;

public class Main2 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000000);
        Student student1 = new Student("Anton", bankAccount);
        Student student2 = new Student("Artem", bankAccount);
    student1.start();
    student2.start();
    }
}

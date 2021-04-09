package Threads;

public class Student extends Thread {
    String name;
    BankAccount bankAccount;

    public Student(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public void buy() {
        if (bankAccount.getMoney() > 0) {
            bankAccount.setMoney(bankAccount.getMoney() - 10);
        } else throw new IllegalArgumentException("No Money");
    }

    public void run() {
        synchronized (bankAccount) {
            while (bankAccount.getMoney() > 0) {
                System.out.println(name + " что-то купил");
                buy();
            }
        }
    }
}

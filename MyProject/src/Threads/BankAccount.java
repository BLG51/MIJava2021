package Threads;

import java.util.Random;

public class BankAccount {
    private int name;
    private int money;

    public BankAccount(int money) {
        Random random = new Random();
        this.name = random.nextInt(1000);
        this.money = money;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

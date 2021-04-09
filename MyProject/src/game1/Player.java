package game1;

import java.util.Random;

public class Player {
    private String name;
    private int hp;
    private String battlecry;
    protected Sword sword;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public Sword getSword() {
        return sword;
    }


    public Player(String name, String battlecry) {
        this.name = name;
        this.hp = 100;
        this.battlecry = battlecry;
        this.sword = new Sword();
    }

    public void shout() {
        System.out.println(battlecry);
    }

    public void getNewSword() {
        sword = new Sword();
    }

    public void getNewPowerSword() {
        sword = new PowerSword();
        ((PowerSword) sword).increasePower();
    }

    public void heal(){
        Random random = new Random();
        hp += random.nextInt(30);
    }

    public void slash(Player p) {
        if (sword.getDurability() > 0) {
            Random random = new Random();
            if (random.nextInt(100) > sword.getWeight()) {
                p.setHp(p.getHp() - random.nextInt(sword.getPower()));
                sword.setDurability(sword.getDurability() - random.nextInt(10));
            }
        }
    }
}

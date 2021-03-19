package game1;

import java.util.Random;

public class Player {
    private String name;
    private int hp;
    private String battlecry;
    Sword sword;


    //public/private void/int/String/...   name(){}

    public void getNewSword(){
        sword = new Sword();
    }

    public void setBattlecry(String battlecry){
       this.battlecry = battlecry;
    }

    public String getBattlecry(){
        return battlecry;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
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

    public void slash(Player p) {
        Random random = new Random();
        if (random.nextInt(100) > sword.getWeight()) {
            p.setHp(p.getHp() - random.nextInt(sword.getPower()));
            sword.setDurability(sword.getDurability() - random.nextInt(10));
        }
    }
}

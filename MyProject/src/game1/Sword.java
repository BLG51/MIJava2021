package game1;

public class Sword {
    private int durability;
    protected int power;
    private int weight;

    Sword(){
        this.durability = 100;
        this.power = 20;
        this.weight = 10;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}

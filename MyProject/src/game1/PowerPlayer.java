package game1;

public class PowerPlayer extends Player{

    public void dounleslash(Player p) {
        if (sword.getDurability() > 0) {
            Random random = new Random();
            if (random.nextInt(100) > sword.getWeight()) {
                p.setHp(p.getHp() - random.nextInt(sword.getPower()));
                sword.setDurability(sword.getDurability() - random.nextInt(10));
            }
        }
        if (sword.getDurability() > 0) {
            Random random = new Random();
            if (random.nextInt(100) > sword.getWeight()) {
                p.setHp(p.getHp() - random.nextInt(sword.getPower()));
                sword.setDurability(sword.getDurability() - random.nextInt(10));
            }
        }
    }

    public PowerPlayer(String name, String battlecry) {
        super(name, battlecry);
    }
}

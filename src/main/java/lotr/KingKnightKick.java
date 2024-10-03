package lotr;

import java.util.Random;
// removes code duplication in king and knight
abstract public class KingKnightKick extends Character implements Kickable{
    private Random rand = new Random();

    public KingKnightKick(int minPower, int maxPower, int minHp, int maxHp) {
        this.power = rand.nextInt(maxPower - minPower + 1) + minPower;
        this.hp = rand.nextInt(maxHp - minHp + 1) + minHp;
    }

    @Override
    public void kick(Character enemy) {
        int damage = rand.nextInt(enemy.getPower()) + 1;
        enemy.setHp(enemy.getHp() - damage);
    }
}

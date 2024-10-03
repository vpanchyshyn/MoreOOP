package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println(c1.getClass().getSimpleName() + " vs "
        + c2.getClass().getSimpleName());
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " kicks "
            + c2.getClass().getSimpleName());
            c1.kick(c2);
            System.out.println(c2.getClass().getSimpleName() + " has "
            + c2.getHp() + " HP remaining.");
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName()
                + " is dead!");
                break;
            }
            System.out.println(c2.getClass().getSimpleName() + " kicks "
            + c1.getClass().getSimpleName());
            c2.kick(c1);
            System.out.println(c1.getClass().getSimpleName() + " has "
            + c1.getHp() + " HP remaining.");
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName()
                + " is dead!");
            }
        }
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName()
            + " wins the fight!");
        }
        else {
            System.out.println(c2.getClass().getSimpleName()
            + " wins the fight!");
        }
    }
}


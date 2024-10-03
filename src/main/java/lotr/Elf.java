package lotr;

public class Elf extends Character{
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }
    @Override
    public void kick(Character c) {
        if (c.power < this.power) {
            c.setHp(0);
        }
        else {
            if (c.power > 0) {
                c.power -= 1;
            }
            else {
                c.power = 0;
            }
        }
    }
    @Override
    public String toString() {
        return "Elf{hp=" + hp + ", power=" + power + "}";
    }

}

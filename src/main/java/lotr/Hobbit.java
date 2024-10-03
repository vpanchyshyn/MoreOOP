package lotr;

public class Hobbit extends Character{
    public Hobbit() {
        this.power = 0;
        this.hp = 3;
    }
    @Override
    public void kick(Character c) {
        toCry();
    }
    @Override
    public String toString() {
        return "Hobbit{hp=" + hp + ", power=" + power + "}";
    }
    public void toCry() {
        System.out.println("Hobbit is crying :(");
    }

}

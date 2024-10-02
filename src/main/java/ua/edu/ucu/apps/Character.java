package ua.edu.ucu.apps;

public abstract class Character {
    protected int power;
    protected int hp;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        }
        else {
            this.hp = 0; //min hp is 0 -> character is dead
        }
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return this.hp > 0;
    }
}

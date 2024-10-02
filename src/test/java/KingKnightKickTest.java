import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ua.edu.ucu.apps.KingKnightKick;
import ua.edu.ucu.apps.Character;

class TestEnemy extends Character {
    @Override
    public void kick(Character enemy) {
    }
}

public class KingKnightKickTest {
    private KingKnightKick kingKnight;
    private TestEnemy enemy;

    @BeforeEach
    public void init() {
        kingKnight = new KingKnightKick(5, 15, 5, 15) {};
        enemy = new TestEnemy();
        enemy.setHp(10);
        enemy.setPower(7);
    }

    @Test
    public void testKick() {
        kingKnight.kick(enemy);
        assertTrue(enemy.getHp() <= 10 && enemy.getHp() >= 3);
    }

    @Test
    public void testIsAlive() {
        kingKnight.setHp(0);
        assertFalse(kingKnight.isAlive());
    }
}

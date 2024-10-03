package lotr;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lotr.Character;
import lotr.Elf;
import lotr.GameManager;
import lotr.Hobbit;

import static org.junit.jupiter.api.Assertions.*;

public class GameManagerTest {
    private GameManager gameManager;
    private Character hobbit;
    private Character elf;

    @BeforeEach
    public void init() {
        gameManager = new GameManager();
        hobbit = new Hobbit();
        elf = new Elf();
    }

    @Test
    public void testFight() {
        gameManager.fight(hobbit, elf);
        assertFalse(hobbit.isAlive());
        assertTrue(elf.isAlive());
    }
}

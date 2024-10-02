import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ua.edu.ucu.apps.GameManager;
import ua.edu.ucu.apps.Character;
import ua.edu.ucu.apps.Hobbit;
import ua.edu.ucu.apps.Elf;

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

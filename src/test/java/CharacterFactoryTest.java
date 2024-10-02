import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ua.edu.ucu.apps.CharacterFactory;
import ua.edu.ucu.apps.Character;

public class CharacterFactoryTest {
    private CharacterFactory factory;

    @BeforeEach
    public void init() {
        factory = new CharacterFactory();
    }

    @Test
    public void testCreateCharacter() {
        Character character = factory.createCharacter();
        assertNotNull(character);
        assertTrue(character instanceof Character);
    }
}

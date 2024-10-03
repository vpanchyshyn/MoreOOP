package lotr;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lotr.Character;
import lotr.CharacterFactory;

import static org.junit.jupiter.api.Assertions.*;

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

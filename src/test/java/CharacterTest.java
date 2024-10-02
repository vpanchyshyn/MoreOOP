import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ua.edu.ucu.apps.Character;

public class CharacterTest {
    private Character character;

    @Test
    public void testSetHp() {
        character = new Character() {
            @Override
            public void kick(Character enemy) {
            }
        };
        character.setHp(-10);
        assertEquals(0, character.getHp());
    }

    @Test
    public void testGetPower() {
        character = new Character() {
            @Override
            public void kick(Character enemy) {
            }
        };
        character.setPower(5);
        assertEquals(5, character.getPower());
    }
}

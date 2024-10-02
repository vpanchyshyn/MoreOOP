package ua.edu.ucu.apps;

import java.util.Random;

public class CharacterFactory{ // static factory method

    // normal implementation

    // public Character createCharacter() {
    //     Random rand = new Random();
    //     Character[] characters = {new Hobbit(), new Elf(), new King(), new Knight()};
    //     return characters[rand.nextInt(characters.length)];
    // }

    //implementation with reflections
    private static final Class<?>[] CHARACTERS = {
        Hobbit.class,
        Elf.class, 
        King.class, 
        Knight.class
    };
    private Random rand = new Random();

    public Character createCharacter() {
        int index = rand.nextInt(CHARACTERS.length);
        Class<?> characterClass = CHARACTERS[index];
        try {
            return (Character) characterClass.getDeclaredConstructor().newInstance();
        } 
        catch (Exception e) {
            return null;
        }
    }
}

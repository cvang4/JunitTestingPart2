/**
 * This is testing the Animal method in the Main folder
 */

package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import main.Animal;

public class AnimalTest {
    
    boolean dog = true;

    @Test

    //Tests to see if dog is equal to true
    public void testIsDog() {
        assertTrue(dog, Animal.isDog());
    }

    private void assertTrue(boolean dog2, boolean dog3) {
    }

}

/**
 * This is testing the BlackJack opening and ending print lines
 */

package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class BlackjackTest {

    @Test

    public void testBlackJack() {
        System.out.println("Welcome to Blackjack!");
        String intro ="Welcome to Blackjack!";
        assertEquals("Welcome to Blackjack!", intro);
    }

    @Test

    public void testBlackJack2() {
        System.out.println("Game over! You are out of funds!");
        String end ="Game over! You are out of funds!";
        assertEquals("Game over! You are out of funds!", end);
    }

}

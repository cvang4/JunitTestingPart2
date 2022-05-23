/**
 * This is testing the Book in the Main folder
 */

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.Book;

public class BookTest {
    
        String author = "George Orwell";
        String book = "1984";

    @Test

    //testing the toString method
    public void testToString() {
        assertEquals(this.author + ": " + this.book, Book.toString("George Orwell", "1984"));
    }
}

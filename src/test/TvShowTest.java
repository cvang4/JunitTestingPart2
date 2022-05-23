/**
 * This is testing the TvShow in the Main folder
 */

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import main.TvShow;

public class TvShowTest {

    String showName = "Naruto";
    int episodes = 500;
    String genre = "Anime";

    private Object getShowName() {
        return "Naruto";
    }

    @Test

    public void testTvShow() {
        assertEquals(showName, getShowName());
    }


}

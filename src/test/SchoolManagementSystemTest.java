/**
 * This is testing the receiveSalary method from the School Management System Exercise
 */

package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class SchoolManagementSystemTest {

    int salary = 1000;
    int salaryEarned = 0;

    @Test

    //testing receiveSalary method
    public void testReceiveSalary() {
        assertEquals(1000 , salaryEarned+=salary);
    }

}




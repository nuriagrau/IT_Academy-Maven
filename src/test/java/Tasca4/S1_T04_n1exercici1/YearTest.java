package Tasca4.S1_T04_n1exercici1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    Year newYear = new Year();
    @BeforeEach
    void setUp() {
        newYear.addMonths();
    }

    @Test
    void size_test() {
        assertEquals(12, newYear.getYear().size());
    }

    @Test
    void not_null_test() {
        assertNotNull(newYear.getYear());
    }

    @Test
    void value_test() {
        assertEquals("August", newYear.getYear().get(7));
    }
}
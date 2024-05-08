package Tasca4.S1_T04_n1exercici1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class YearTest {

   Year newYear = new Year();

    @BeforeEach
    void setUp() {
        newYear.addMonths();
    }

    @Test
    @DisplayName("Should return 12 months")
    void size_test() {
        assertEquals(12, newYear.getYear().size());
    }

    @Test
    @DisplayName("Should return is not null")
    void not_null_test() {
        assertNotNull(newYear.getYear());
    }

    @Test
    @DisplayName("Should return position 8 is August")
    void value_test() {
        assertEquals("August", newYear.getYear().get(7));
    }
}
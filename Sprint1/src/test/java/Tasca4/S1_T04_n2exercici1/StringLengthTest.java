package Tasca4.S1_T04_n2exercici1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StringLengthTest {

    @Test
    @DisplayName("Should assert if Mordor has a length of 8 ")
    public void StringLengthTestMordor() {
        assertThat("mordor", StringLength.length(is(8)));
    }

    @Test
    @DisplayName("Should assert if Meriadoc has a length of 8")
    public void StringLengthTestMeriadoc() {
        assertThat("meriadoc", StringLength.length(is(8)));
    }

    @Test
    @DisplayName("Should assert if Aragon length is equal to Legolas")
    public void StringEqualsAragonTest() {
        assertThat("Legolas", StringLength.equalToIgnoringCase(is(true)));
    }

}

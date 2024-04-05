package Tasca4.S1_T04_n2exercici1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StringLengthTest {

    @Test
    public void StringLengthTestMordor() {
        assertThat("mordor", StringLength.length(is(8)));
    }

    @Test
    public void StringLengthTestMeriadoc() {
        assertThat("meriadoc", StringLength.length(is(8)));
    }

    @Test
    public void StringEqualsAragonTest() {
        assertThat("Legolas", StringLength.equalToIgnoringCase(is(true)));
    }

}

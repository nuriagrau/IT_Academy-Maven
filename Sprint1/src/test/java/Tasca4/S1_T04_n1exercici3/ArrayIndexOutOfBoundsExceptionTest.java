package Tasca4.S1_T04_n1exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

class ArrayIndexOutOfBoundsExceptionTest {


    ArrayIndexOutOfBounds arrayIndexOutOfBounds = new ArrayIndexOutOfBounds();
    ArrayList<String> noms = new ArrayList<String>();

    @Test
    public void ArrayIndexOutOfBounds_shouldTrowExceptionTest() {
        Exception exception = Assertions.assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> {arrayIndexOutOfBounds.provocarArrayIndexOutOfBounds();});
    }

    @Test
    public void ExceptionMessage_Test() {
        Exception exception = Assertions.assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> {arrayIndexOutOfBounds.provocarArrayIndexOutOfBounds();});
        assertEquals( "Index 0 out of bounds for length 0", exception.getMessage());
    }



}
package Tasca4.S1_T04_n1exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculDniTest {

    @ParameterizedTest
    @CsvSource({
            "23726656, V",
            "75120377, P",
            "47601336, F",
            "42649555, B",
            "25394301, R",
            "19833207, P",
            "24534791, R",
            "95065735, L",
            "66337608, L",
            "29231876, A"
    })
    @DisplayName("Hauria de retornar la lletra correcta")
    public void testLetraDni(int numDni, char lletraEsperada) {
        char lletraCalculada = CalculDni.lletraDNI(numDni);
        Assertions.assertEquals(lletraEsperada, lletraCalculada);
    }





}

package Tasca4.S1_T04_n1exercici2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculDniTest {

    HashMap<Integer, Character> map = new HashMap<>();


    @BeforeEach
    void setMap() {
        map.put(23726656, 'V');
        map.put(75120377, 'P');
        map.put(47601336, 'F');
        map.put(42649555, 'B');
        map.put(25394301, 'R');
        map.put(19833207, 'P');
        map.put(24534791, 'R');
        map.put(95065735, 'L');
        map.put(66337608, 'L');
        map.put(29231876, 'A');
    }

    @ParameterizedTest
    @ValueSource(ints = {23726656,75120377,47601336,42649555,25394301, 19833207, 24534791, 95065735, 66337608, 29231876})
    void Calcul_Dni_Test(int numeroDNI) {
         assertEquals(CalculDni.lletraDNI(numeroDNI), map.get(numeroDNI));
    }

}

package Tasca8.S1_T08_n1exercici6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.Collections.sort;

public class Main {

    //TODO Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.
    public static void main(String[] args) {

        List<Object> llista = Arrays.asList(0, "zero", 1, "un", 2, "dos", 3, "tres", 4, "quatre", 5, "cinc", 6, "sis", 7, "set", 8, "vuit", 9, "nou", 10, "deu");

        llista.stream()
                .filter(l -> l instanceof String)
                .map(Object -> (String) Object)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}

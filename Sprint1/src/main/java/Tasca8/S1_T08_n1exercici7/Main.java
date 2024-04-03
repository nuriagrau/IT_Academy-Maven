package Tasca8.S1_T08_n1exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    //TODO Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
    public static void main(String[] args) {

        List<Object> llista = Arrays.asList(0, "zero", 1, "un", 2, "dos", 3, "tres", 4, "quatre", 5, "cinc", 6, "sis", 7, "set", 8, "vuit", 9, "nou", 10, "deu");

        llista.stream()
                .filter(l -> l instanceof String)
                .map(Object -> (String) Object)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);
    }
}

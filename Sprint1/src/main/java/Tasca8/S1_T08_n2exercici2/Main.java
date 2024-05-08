package Tasca8.S1_T08_n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // TODO Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers. Cada element
    //  ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o” si el nombre és imparell. Per
    //  exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. Imprimeix el resultat.
    public static void main(String[] args){

        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765));

        List<String> evenOddIntegers = getEvenOddIntegers(integers);

        String string = evenOddIntegers.stream()
                .collect(Collectors.joining(", ", "\"", "\""));
        System.out.println(string);
    }

    public static List<String> getEvenOddIntegers(List<Integer> integers) {
        String even = "e";
        String odd = "o";
        List<String> evenOddNumbers = new ArrayList<>();
        integers.stream()
                .forEach(integer -> {
                    if (integer.intValue() % 2 == 0) {
                        evenOddNumbers.add(even.concat(String.valueOf(integer)));
                    } else {
                        evenOddNumbers.add(odd.concat(String.valueOf(integer)));
                    }
                });
        return evenOddNumbers;
    }

}

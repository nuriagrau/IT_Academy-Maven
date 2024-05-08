package Tasca8.S1_T08_n2exercici4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    // TODO Crea una llista que contingui algunes cadenes de text i nombres.
    //  Ordena-les per:

    public static void main(String[] args) {

        List<Object> llista = Arrays.asList(0, "zero", 1, "un", 2, "dos", 3, "tres", 4, "quatre", 5, "cinc", 6, "sis", 7, "set", 8, "vuit", 9, "nou", 10, "deu");

        // Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter)
        List<String> sortedAlfabeticament = (List<String>) llista.stream()
                .filter(l -> l instanceof String)
                .map(Object -> (String) Object)
                .sorted(Comparator.comparingInt(obj -> String.valueOf(obj).charAt(0)))
                .collect(Collectors.toList());
        System.out.println(sortedAlfabeticament);

        // Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.
        List<String> sortedEFirst = (List<String>) llista.stream()
                .filter(l -> l instanceof String)
                .map(Object -> (String) Object)
                .sorted(Comparator.comparingInt(s -> s.indexOf("e")))
                .collect(Collectors.toList()).reversed();
        System.out.println(sortedEFirst);

        //  Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
        List<String> aTo4 = (List<String>) llista.stream()
                .filter(l -> l instanceof String)
                .map(Object -> (String) Object)
                .filter(s -> s.contains("a") || s.contains("A"))
                .map(s -> s.replace("a", "4"))
                .map(s -> s.replace("A", "4"))
                .collect(Collectors.toList());
        System.out.println(aTo4);

        //  Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).
        List<Number> numerics = (List<Number>) llista.stream()
                .filter(l -> l instanceof Number)
                .map(Object -> (Number) Object)
                .collect(Collectors.toList());
        System.out.println(numerics);

    }
}




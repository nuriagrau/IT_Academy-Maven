package Tasca8.S1_T08_n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    // TODO A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen
    //  la lletra ‘o’. Imprimeix el resultat.
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();

        words.add("foo");
        words.add("boo");
        words.add("bar");
        words.add("baz");
        words.add("qux");
        words.add("quux");
        words.add("corge");
        words.add("grault");
        words.add("garply");
        words.add("waldo");
        words.add("fred");
        words.add("plugh");
        words.add("xyzzy");
        words.add("thud");

        List<String> oWords = selectOWords(words, "o");
        oWords.forEach(w -> System.out.println(w));
    }

    public static List<String> selectOWords(List<String> words, String c) {
        words
                .stream()
                .filter(w -> w.toLowerCase().contains(c))
                .collect(Collectors.toList());
        return words;
    }

}

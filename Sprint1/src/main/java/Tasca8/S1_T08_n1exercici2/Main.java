package Tasca8.S1_T08_n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //TODO Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings
    // que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.

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

        List<String> oWords = selectOWords(words, "o", 5);
        oWords.forEach(w -> System.out.println(w));
    }

    public static List<String> selectOWords(List<String> words, String c, int nLetters) {
        return words
                .stream()
                .filter(w -> w.toLowerCase().contains(c) && w.length() == nLetters)
                .collect(Collectors.toList());
    }
}

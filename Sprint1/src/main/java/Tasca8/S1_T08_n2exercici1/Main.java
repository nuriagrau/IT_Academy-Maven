package Tasca8.S1_T08_n2exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // TODO Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una llista de totes les cadenes que
    //  comencen amb la lletra 'A' (majúscula) i  tenen exactament 3 lletres. Imprimeix el resultat.

    public static void main(String[] args) {
        List<String> noms = new ArrayList<>(Arrays.asList("Amelia", "Ava", "Aria", "Abigail", "Avery", "Aurora", "Addison", "Alice", "Audrey", "Aaliyah", "Autumn", "Athena", "Anna", "Ann", "Ariana", "Adeline", "Allison", "Andrea", "Anatasia", "Adriana"));

        List<String> nomsADeTres = nomsADeTres(noms, 'A', 3);
        System.out.println(nomsADeTres);
    }

    public static List<String> nomsADeTres(List<String> noms, char a, int wordLength) {
        return noms.stream()
                .filter(s -> s.charAt(0) == a && s.length() == wordLength)
                .collect(Collectors.toList());
    }
}

package Tasca8.S1_T08_n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // TODO Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.

    public static void main(String[] args) {

        List<String> year = new ArrayList<>();

        year.add("January");
        year.add("February");
        year.add("March");
        year.add("April");
        year.add("May");
        year.add("June");
        year.add("July");
        year.add("August");
        year.add("September");
        year.add("October");
        year.add("November");
        year.add("December");

        // Lambda expression
        year.forEach(m -> System.out.println(m));

    }
}

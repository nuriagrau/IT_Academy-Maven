package Tasca8.S1_T08_n1exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //TODO Fer la mateixa impressió del punt anterior, però mitjançant method reference.

    public static void main(String[] args) {

        List<String> year = new ArrayList<>(Arrays.asList("January","February", "March" ));

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

        // Method reference calling
        year.forEach(System.out::println);


    }
}

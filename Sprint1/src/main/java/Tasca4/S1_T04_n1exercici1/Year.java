package Tasca4.S1_T04_n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Year {

    private List<String> year;

    public Year() {
        this.year = new ArrayList<>();
    }

    public List<String> getYear() {
        return this.year;
    }

    public void addMonths() {
        this.year.add("January");
        this.year.add("February");
        this.year.add("March");
        this.year.add("April");
        this.year.add("May");
        this.year.add("June");
        this.year.add("July");
        this.year.add("August");
        this.year.add("September");
        this.year.add("October");
        this.year.add("November");
        this.year.add("December");
    }

    public static void main(String[] args) {
        Year year = new Year();
        year.addMonths();
        System.out.println(year.getYear());
        System.out.println(year.getYear().size());
    }

}

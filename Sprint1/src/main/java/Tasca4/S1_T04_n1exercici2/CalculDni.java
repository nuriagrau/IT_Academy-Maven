package Tasca4.S1_T04_n1exercici2;

import java.util.Scanner;

public class CalculDni {

        final static char[] LLETRA_DNI = {'T', 'R', 'W', 'A','G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        public static void main(String[] args) {
            int numeroDNI = 0;
            System.out.println(lletraDNI(numeroDNI));
        }

        public static char lletraDNI(int numeroDNI) {
            return LLETRA_DNI[numeroDNI % 23];
        }



}

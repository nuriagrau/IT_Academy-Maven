package Tasca6.S1_T06_n2exercici2;


import java.util.List;

public class GenericMethods {

    // Vararg methods
    static <T> void genericDisplay(T... a) {
        String display = "En aquesta crida hi ha " + a.length + " paràmetres: \n";
        for (int i = 0; i < a.length; i++){
            display += "El parametre " + (i + 1) + " és del tipus: " + a[i].getClass() + " = " + a[i] + "\n";
        }
        System.out.println(display);
    }
}

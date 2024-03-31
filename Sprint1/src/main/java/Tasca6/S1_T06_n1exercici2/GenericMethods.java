package Tasca6.S1_T06_n1exercici2;

public class GenericMethods {
    static <T> void genericDisplay(T parameter1, T parameter2, T parameter3) {
        System.out.println("Parametre 1 és del tipus: " + parameter1.getClass().getName() + " = " + parameter1 + "\n" +
                "Parametre 2 és del tipus: " + parameter2.getClass().getName() + " = " + parameter2 +"\n" +
                "Parametre 3 és del tipus: " + parameter3.getClass().getName() + " = " + parameter3 + "\n" );
    }
}

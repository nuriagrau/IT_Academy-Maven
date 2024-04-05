package Tasca6.S1_T06_n2exercici1;

public class GenericMethods {
    static <T> void genericDisplay(T parameter1, T parameter2, Persona parameter3) {
        System.out.println("Parametre 1 és del tipus: " + parameter1.getClass() + " = " + parameter1 + "\n" +
                "Parametre 2 és del tipus: " + parameter2.getClass() + " = " + parameter2 +"\n" +
                "Parametre 3 és del tipus: " + parameter3.getClass() + " = " + parameter3 + "\n" );
    }
}

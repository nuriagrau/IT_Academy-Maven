package Tasca6.S1_T06_n2exercici1;

import static Tasca6.S1_T06_n2exercici1.GenericMethods.*;
public class Main {
    //TODO Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.

    public static void main(String[] args) {

        Persona JohnDoe = new Persona("John", "Doe", 30);
        String genericMethods = "Els mètodes genèrics accepten qualsevol tipus de paràmetre.";
        int numberOfParameters = 3;

        Persona JaneDoe = new Persona("Jane", "Doe", 25);

        // 3rd parameter must be a person
        genericDisplay(genericMethods, numberOfParameters, JohnDoe);

        genericDisplay(numberOfParameters, genericMethods, JaneDoe);

        genericDisplay(JohnDoe, genericMethods, JaneDoe);

    }

}

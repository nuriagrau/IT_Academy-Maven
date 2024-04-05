package Tasca6.S1_T06_n2exercici2;

import static Tasca6.S1_T06_n2exercici2.GenericMethods.*;

public class Main {
    //TODO Modifica l'apartat anterior de manera que els arguments del mètode genèric siguin una llista d'arguments de
    // variable indefinida.

    public static void main(String[] args) {

        Persona JohnDoe = new Persona("John", "Doe", 30);
        String genericMethods = "Els mètodes genèrics accepten qualsevol tipus de paràmetre.";
        int numberOfParameters = 3;

        Persona JaneDoe = new Persona("Jane", "Doe", 25);

        // 3rd parameter must be a person
        genericDisplay(genericMethods, numberOfParameters, JohnDoe);

        genericDisplay(numberOfParameters, genericMethods, JohnDoe, JaneDoe);

        genericDisplay(numberOfParameters);

        genericDisplay(JaneDoe, numberOfParameters);
    }

}

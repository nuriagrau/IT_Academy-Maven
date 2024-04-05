package Tasca6.S1_T06_n1exercici2;

import static Tasca6.S1_T06_n1exercici2.GenericMethods.*;

public class Main {
    //TODO Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada
    // GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. Aquest mètode només ha
    // d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal, crida el mètode genèric amb
    // diferents tipus de paràmetres.Exemple: un objecte de la classe Persona, un String i un tipus primitiu.D’aquesta
    // manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.

    public static void main(String[] args) {

        Persona JohnDoe = new Persona("John", "Doe", 30);
        String genericMethods = "Els mètodes genèrics accepten qualsevol tipus de paràmetre.";
        int numberOfParameters = 3;

        genericDisplay(JohnDoe, genericMethods, numberOfParameters);

        genericDisplay(genericMethods, numberOfParameters, JohnDoe);

        genericDisplay(numberOfParameters, JohnDoe, genericMethods);
    }

}

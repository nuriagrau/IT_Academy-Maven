package Tasca8.S1_T08_n1exercici5;

import java.util.concurrent.Callable;

public class Main {
    //TODO Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double.
    // Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415.
    // Invoca el mètode getPiValue() i imprimeix el resultat.

    public static void main(String[] args) {

        // Instancia de la interfície i assignació de valor
        Functional_Interface pi = () -> 3.1416; // equival a:
        /* new Functional_Interface() {
            @Override
            public double getPiValue() {
                return 3.1416;
            }
        }; */


        // Invocació i impressió de resultat
        System.out.println(pi.getPiValue());
    }
}

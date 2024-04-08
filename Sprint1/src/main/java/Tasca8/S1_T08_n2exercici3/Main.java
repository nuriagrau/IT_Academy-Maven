package Tasca8.S1_T08_n2exercici3;

public class Main {

    // TODO Crea una Functional Interface que contingui un mètode anomenat operacio(). Aquest mètode ha de retornar un
    //  float. Injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que es pugui
    //  transformar l’operació amb una suma, una resta, una multiplicació i una divisió.

    public static void main(String[] args) {

        Operand suma = (int a, int b) -> a + b ;

        Operand resta = (int a, int b) -> a - b;

        Operand multiplicacio = (int a, int b) -> a * b;

        Operand divisio = (int a, int b) -> a / b;
        
        System.out.println("4 + 2 = " + suma.operacio(4, 2));
        System.out.println("4 - 2 = " + resta.operacio(4,2));
        System.out.println("4 * 2 = " + multiplicacio.operacio(4,2));
        System.out.println("4 / 2 = " + divisio.operacio(4,2));
    }

}

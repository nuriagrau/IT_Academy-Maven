package Tasca4.S1_T04_n1exercici3;

import java.util.ArrayList;

public class ArrayIndexOutOfBounds extends Throwable{
    /*Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
    Verifica el seu correcte funcionament amb un test jUnit.*/
    static ArrayList<String> noms = new ArrayList<String>();

    public static void provocarArrayIndexOutOfBounds() throws ArrayIndexOutOfBoundsException {
            int index[];
            index = new int[noms.size()];
            int ultimElement = index[noms.size()];
    }

    public static void main(String[] args) {
        ArrayList<String> noms = new ArrayList<String>();

        try {
            provocarArrayIndexOutOfBounds();

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("S'ha provocat un ArrayIndexOutOfBounds exception.");
            System.out.println(e.getMessage());
        }
    }
}

package Tasca8.S1_T08_n1exercici8;

public class Main {

    // TODO Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de
    //  retornar un String. En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda,
    //  el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la
    //  instància de la interfície passant-li una cadena i comprova si el resultat és correcte.

    public static void main(String[] args) {

        Functional reverseMethod = (String s) -> new StringBuilder(s).reverse().toString();
                /*char[] reversed = s.toCharArray();
                //
                List<Character> reversedArray = new ArrayList<>();
                for(char c : reversed) {
                    reversedArray.add(c);
                }
                Collections.reverse(reversedArray);
                return reversedArray.toString();*/

                /*StringBuffer sbr = new StringBuffer(s);
                return sbr.reverse().toString();*/

                /*StringBuilder sb = new StringBuilder(s);
                return sb.reverse().toString();*/

        System.out.println(reverseMethod.reverse("Hello"));

    }
}

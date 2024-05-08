package Tasca7.S1_T07_n1exercici2;

public class Main {
    //TODO Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca
    // des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per
    // ser obrsolets.

    public static void main(String[] args) {

        @SuppressWarnings("deprecation")

        TreballadorPresencial JohnDoe = new TreballadorPresencial("John", "Doe",10.77, 55.00);

        TreballadorOnline JaneDoe = new TreballadorOnline("Jane", "Doe",10.77);

        System.out.println(JohnDoe + " sou=" + JohnDoe.calcularSou(160));
        double costTransport = JohnDoe.calculCostTransport(30, 1.607f, 0.44f);
        System.out.println("El cost de transport és de : " + costTransport + " euros");


        System.out.println(JaneDoe + " sou=" + JaneDoe.calcularSou(160));
        float costInternet = JaneDoe.calculTarifaInternet(300, 0.105f);
        System.out.println("El cost d'internet és de: " + costInternet + " euros");
    }
}

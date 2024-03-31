package Tasca7.S1_T07_n1exercici2;

public class Main {
    //TODO Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca
    // des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per
    // ser obrsolets.

    public static void main(String[] args) {

        //@SuppressWarnings("deprecation") //  suppress or ignore warnings coming from the compiler

        TreballadorPresencial JohnDoe = new TreballadorPresencial("John", "Doe",10.77, 55.00);

        TreballadorOnline JaneDoe = new TreballadorOnline("Jane", "Doe",10.77);

        // Same preuHora and horesTreballadesMes, different results due @override of calcularSou() for TreballadorPresencial
        System.out.println(JohnDoe.toString() + " sou=" + JohnDoe.calcularSou(160));
        JohnDoe.calculCostTransport(30, 1.607f, 0.44f);

        // Same preuHora and horesTreballadesMes, different results due @override of calcularSou() for TreballadorOnline
        System.out.println(JaneDoe.toString() + " sou=" + JaneDoe.calcularSou(160));
        JaneDoe.calculTarifaInternet(300, 0.105f);
    }
}

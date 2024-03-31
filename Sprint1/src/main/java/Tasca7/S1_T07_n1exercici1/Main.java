package Tasca7.S1_T07_n1exercici1;

public class Main {

    //TODO Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.La
    // classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el
    // nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure,  emprant
    // @Override.Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de
    // l’anotació @Override.En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el
    // nombre d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel
    // preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.En els treballadors
    // online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de
    // calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa
    // plana d'Internet, que serà una constant de la classe TreballadorOnline.
    public static void main(String[] args) {

        TreballadorPresencial JohnDoe = new TreballadorPresencial("John", "Doe",10.77, 55.00);

        TreballadorOnline JaneDoe = new TreballadorOnline("Jane", "Doe",10.77);

        // Same preuHora and horesTreballadesMes, different results due @override of calcularSou() for TreballadorPresencial
        System.out.println(JohnDoe.toString() + " sou=" + JohnDoe.calcularSou(160));

        // Same preuHora and horesTreballadesMes, different results due @override of calcularSou() for TreballadorOnline
        System.out.println(JaneDoe.toString() + " sou=" + JaneDoe.calcularSou(160));
    }
}

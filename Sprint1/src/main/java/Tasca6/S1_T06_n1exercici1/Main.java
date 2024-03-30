package Tasca6.S1_T06_n1exercici1;

public class Main {
    public static void main(String[] args) {
        //TODO Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, juntament amb
        // els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres.
        // Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.

        Animal zebra = new Animal("zebra", "mammal","hervivore", "continental" );
        Animal shark = new Animal("shark", "oviparous", "carnivore", "marine");
        Animal bat  = new Animal("bat", "mammal", "omnivore", "aerial");


        NoGenericMethods group1 = new NoGenericMethods(zebra, shark, bat);
        NoGenericMethods group2 = new NoGenericMethods(shark, bat, zebra);
        NoGenericMethods group3 = new NoGenericMethods(bat, zebra, shark);

        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);

    }
}

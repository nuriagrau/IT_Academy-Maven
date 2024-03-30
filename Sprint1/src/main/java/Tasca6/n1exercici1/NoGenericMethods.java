package Tasca6.n1exercici1;

public class NoGenericMethods {
    private Animal animal1;
    private Animal animal2;
    private Animal animal3;

    public NoGenericMethods(Animal animal1, Animal animal2, Animal animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public Animal getAnimal1() {
        return this.animal1;
    }

    public Animal getAnimal2() {
        return this.animal2;
    }

    public Animal getAnimal3() {
        return this.animal3;
    }

    public void setAnimal1(Animal animal1) {
        this.animal1 = animal1;
    }

    public void setAnimal2(Animal animal2) {
        this.animal2 = animal2;
    }

    public void setAnimal3(Animal animal3) {
        this.animal3 = animal3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods [animal1=," + this.animal1 + ", animal2=" + this.animal2 + ", animal3=" + this.animal3 + "]";
    }
}

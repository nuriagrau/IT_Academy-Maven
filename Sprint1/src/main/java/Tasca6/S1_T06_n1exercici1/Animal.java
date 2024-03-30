package Tasca6.S1_T06_n1exercici1;

public class Animal {
    private String name;
    private String reproduction;
    private String foodSource;
    private String environment;

    public Animal(String name, String reproduction, String foodSource, String environment) {
        this.name = name;
        this.reproduction = reproduction;
        this.foodSource = foodSource;
        this.environment = environment;
    }

    @Override
    public String toString() {
        return this.name + "[reproduction=" + this.reproduction + ", foodSource=" + this.foodSource + ", environment=" + this.environment + "]";
    }

}

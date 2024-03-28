package Tasca5.n1exercici5;

import java.io.*;

public class Transporter implements Serializable {
    private String name;
    private String specie;
    private String title;
    private String origin;
    static  int teletransportations_count;

    public Transporter (String name, String specie, String title, String origin) {
        this.name = name;
        this.specie = specie;
        this.title = title;
        this.origin = origin;
        this.teletransportations_count = 0;
    }

    public int getTeletransportations_count() {
        return this.teletransportations_count;
    }

    public void newTeletransportations_count() {
        this.teletransportations_count += 1;
    }

    @Override
    public String toString() {
        return "Transporter[name=" + this.name + ", specie=" + this.specie + ", title=" + this.title + ", origin=" + this.origin + ", teletransportations_count=" + this.teletransportations_count +"]";
    }
}

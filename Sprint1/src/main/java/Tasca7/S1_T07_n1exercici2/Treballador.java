package Tasca7.S1_T07_n1exercici2;

abstract class Treballador {
    protected String nom;
    protected String cognom;
    double preuHora;

    public Treballador(String nom, String cognom, double preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public double getPreuHora() {
        return this.preuHora;
    }

    public abstract double calcularSou(double horesTreballades);

    @Override
    public String toString() {
        return "Treballador [nom=" + this.nom + ", cognom=" + cognom + ", preuHora=" + preuHora + "]";
    }
}

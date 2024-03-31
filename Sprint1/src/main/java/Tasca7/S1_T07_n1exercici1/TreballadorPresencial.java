package Tasca7.S1_T07_n1exercici1;

class TreballadorPresencial extends Treballador{
    public static double benzina;

    public TreballadorPresencial(String nom, String cognom, double preuHora, double benzina) {
        super(nom, cognom, preuHora);
        this.benzina = benzina;
    }

    @Override
    public double calcularSou(double horesTreballadesMes) {
        double sou = (horesTreballadesMes * super.getPreuHora()) + benzina;
        return sou;
    }
}

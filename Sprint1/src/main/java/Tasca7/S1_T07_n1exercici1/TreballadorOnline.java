package Tasca7.S1_T07_n1exercici1;

public class TreballadorOnline extends Treballador {
    private final double preuTarifaPlanaInternet;

    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
        this.preuTarifaPlanaInternet = 31.50d;
    }

    @Override
    public double calcularSou(double horesTreballadesMes) {
        double sou = (horesTreballadesMes * super.getPreuHora()) + this.preuTarifaPlanaInternet;
        return sou;
    }
}

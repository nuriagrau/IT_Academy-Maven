package Tasca7.S1_T07_n1exercici2;

public class TreballadorOnline extends Treballador {
    private final double preuTarifaPlanaInternet;

    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
        this.preuTarifaPlanaInternet = 31.50d;
    }

    // Javadoc comment follows
    /**
     * @deprecated
     * depracated because of the use of Internet flat rate
     */
    @Deprecated
    public float calculTarifaInternet(int usedMb, float priceMbMonth) {
        return usedMb * priceMbMonth;
    }

    @Override
    public double calcularSou(double horesTreballadesMes) {
        double sou = (horesTreballadesMes * super.getPreuHora()) + this.preuTarifaPlanaInternet;
        return (horesTreballadesMes * super.getPreuHora()) + this.preuTarifaPlanaInternet;
    }
}

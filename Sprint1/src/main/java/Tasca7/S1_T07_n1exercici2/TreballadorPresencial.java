package Tasca7.S1_T07_n1exercici2;

public class TreballadorPresencial extends Treballador{
    public static double benzina;

    public TreballadorPresencial(String nom, String cognom, double preuHora, double benzina) {
        super(nom, cognom, preuHora);
        this.benzina = benzina;
    }

    // Javadoc comment follows
    /**
     * @deprecated
     * depracated because of this calculation including desgastKm is no longer used
     */
    @Deprecated
    public double calculCostTransport(float km, float preuBenzina, float desgastKm) {
        return (km * this.benzina) + (km * desgastKm);
    }

    @Override
    public double calcularSou(double horesTreballadesMes) {
        double sou = (horesTreballadesMes * super.getPreuHora()) + benzina;
        return sou;
    }
}

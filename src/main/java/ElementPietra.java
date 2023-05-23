public class ElementPietra implements PowierzchnoLiczone {

    public int numerPietra;

    public ElementPietra(int numerPietra) {
        this.numerPietra = numerPietra;
    }

    public int getNumerPietra() {
        return numerPietra;
    }

    public void setNumerPietra(int numerPietra) {
        this.numerPietra = numerPietra;
    }

    @Override
    public int obliczPole() {
        return 0;
    }
}

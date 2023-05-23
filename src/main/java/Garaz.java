public class Garaz extends Pomieszczenie implements PowierzchnoLiczone  {

    private int szerokoscBramy;
    private int wysokoscBramy;


    public Garaz(int numerPietra, int szerokosc, int dlugosc, String nazwa, int szerokoscBramy, int wysokoscBramy) {
        super(numerPietra, szerokosc, dlugosc, nazwa);
        this.szerokoscBramy = szerokoscBramy;
        this.wysokoscBramy = wysokoscBramy;
    }

    public int getSzerokoscBramy() {
        return szerokoscBramy;
    }

    public void setSzerokoscBramy(int szerokoscBramy) {
        this.szerokoscBramy = szerokoscBramy;
    }

    public int getWysokoscBramy() {
        return wysokoscBramy;
    }

    public void setWysokoscBramy(int wysokoscBramy) {
        this.wysokoscBramy = wysokoscBramy;
    }

    @Override
    public int obliczPole() {
        return getSzerokosc()*getDlugosc();
    }
}

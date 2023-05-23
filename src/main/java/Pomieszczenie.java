public class Pomieszczenie extends ElementPietra implements PowierzchnoLiczone {

    private int szerokosc;
    private int dlugosc;
    private String nazwa;

    public Pomieszczenie(int numerPietra, int szerokosc, int dlugosc, String nazwa) {
        super(numerPietra);
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.nazwa = nazwa;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public int obliczPole() {
        return szerokosc * dlugosc;
    }
}

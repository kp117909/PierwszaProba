public class Budynek implements PowierzchnoLiczone {

    private int powierzchniaDzialki;
    private Pietro[] Pietra;
    private Garaz [] Garaze;

    public int podajiloscPieter(){
        return Pietra.length;
    }

    public Budynek(int powierzchniaDzialki, Pietro[] pietra, Garaz[] garaze) {
        this.powierzchniaDzialki = powierzchniaDzialki;
        Pietra = pietra;
        Garaze = garaze;
    }

    public int getPowierzchniaDzialki() {
        return powierzchniaDzialki;
    }

    public void setPowierzchniaDzialki(int powierzchniaDzialki) {
        this.powierzchniaDzialki = powierzchniaDzialki;
    }

    public Pietro[] getPietra() {
        return Pietra;
    }

    public void setPietra(Pietro[] pietra) {
        Pietra = pietra;
    }

    public Garaz[] getGaraze() {
        return Garaze;
    }

    public void setGaraze(Garaz[] garaze) {
        Garaze = garaze;
    }

    @Override
    public int obliczPole() {
        int sumaGaraze = 0;
        int sumaPietra = 0;
        int sumaCalkowita = 0;

        for (int i = 0; i < Pietra.length; i++) {
            sumaPietra += Pietra[i].obliczPole();
        }

        for (int i = 0; i < Garaze.length; i++) {
            sumaPietra += Garaze[i].obliczPole();
        }

        sumaCalkowita = sumaPietra + sumaGaraze + powierzchniaDzialki;

        return sumaCalkowita;
    }
}

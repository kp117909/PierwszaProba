public class Pietro implements PowierzchnoLiczone {

    private int numerPietra;
    private ElementPietra[] elementy;

    public int podajIloscPomieszczen(){
        return elementy.length;
    }

    public Pietro(int numerPietra, ElementPietra[] elementy) {
        this.numerPietra = numerPietra;
        this.elementy = elementy;
    }

    public int getNumerPietra() {
        return numerPietra;
    }

    public void setNumerPietra(int numerPietra) {
        this.numerPietra = numerPietra;
    }

    public ElementPietra[] getElementy() {
        return elementy;
    }

    public void setElementy(ElementPietra[] elementy) {
        this.elementy = elementy;
    }

    @Override
    public int obliczPole() {
        int suma = 0;

        for(int i = 0 ; i < elementy.length ; i++){
            suma+= elementy[i].obliczPole();
        }
        return suma;
    }
}

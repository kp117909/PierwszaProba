public class Mieszkanie extends ElementPietra implements PowierzchnoLiczone {

    private Pomieszczenie[] pomieszczenia;
    private String wizytowka;


    public Mieszkanie(int numerPietra, Pomieszczenie[] pomieszczenia, String wizytowka) {
        super(numerPietra);
        this.pomieszczenia = pomieszczenia;
        this.wizytowka = wizytowka;
    }

    public Pomieszczenie[] getPomieszczenia() {
        return pomieszczenia;
    }

    public void setPomieszczenia(Pomieszczenie[] pomieszczenia) {
        this.pomieszczenia = pomieszczenia;
    }

    public String getWizytowka() {
        return wizytowka;
    }

    public void setWizytowka(String wizytowka) {
        this.wizytowka = wizytowka;
    }

    @Override
    public int obliczPole() {
        int sumaMieszkania = 0;

        for(int i =0 ; i < pomieszczenia.length; i++){
            sumaMieszkania+= pomieszczenia[i].obliczPole();
        }
        return sumaMieszkania;
    }
}

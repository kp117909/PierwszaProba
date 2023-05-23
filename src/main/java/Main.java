public class Main {

    public static void main(String[] args) {

        Pomieszczenie pokoj1 = new Pomieszczenie(1, 5,3,"p1");
        Pomieszczenie pokoj2 = new Pomieszczenie(1, 5,5,"p11");

        System.out.println("p1 " + pokoj1.obliczPole());

        Pomieszczenie pokoj3 = new Pomieszczenie(2, 5,3,"p21");
        Pomieszczenie pokoj4 = new Pomieszczenie(2, 5,3,"p22");

        Pomieszczenie[] pomieszczenia_1 = {pokoj1, pokoj2};

        Mieszkanie mieszkanie_1 = new Mieszkanie(1, pomieszczenia_1, "PP1");

        System.out.println("pom1 " + mieszkanie_1.obliczPole());

        Pomieszczenie[] pomieszczenie_2 = {pokoj3, pokoj4};

        Mieszkanie mieszkanie_2 = new Mieszkanie(2, pomieszczenie_2 , "PP2");


        Mieszkanie[] mieszkania_1_t = {mieszkanie_1};

        Mieszkanie[] mieszkania_2_t = {mieszkanie_2};

        Pietro pietro_1 = new Pietro(1, mieszkania_1_t);

        System.out.println("pietro1 " + pietro_1.obliczPole());

        Pietro pietro_2 = new Pietro(2, mieszkania_2_t);

        Garaz garaz = new Garaz(1,5,25,"Garaz_1 ", 5,2);

        System.out.println("Garaz " + garaz.obliczPole());

        Garaz[] garaze = {garaz};

        Pietro[] pietra = {pietro_1, pietro_2};

        Budynek budynek = new Budynek(50, pietra, garaze);

        System.out.println("Budynek " + budynek.obliczPole());


    }
}

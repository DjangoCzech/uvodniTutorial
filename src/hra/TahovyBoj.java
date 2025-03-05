package hra;

public class TahovyBoj {
    public static void main(String[] args) {
        Kostka sestistenna  = new Kostka();
        Kostka desetistenna  = new Kostka(10);
        System.out.println(sestistenna.vratPocetSten());
        System.out.println(desetistenna.vratPocetSten());

        System.out.println(sestistenna);
        for (int i = 0; i < 10; i++) {
            System.out.print(sestistenna.hod() + " ");
        }

        System.out.println("\n\n"+desetistenna);
        for (int i = 0; i < 10; i++) {
            System.out.print(desetistenna.hod() + " ");
        }

        Kostka kostka = new Kostka(10);
        Bojovnik bojovnik = new Bojovnik("Zalgoren", 100, 20, 10, kostka);
        System.out.printf("Bojovnik: %s%n", bojovnik ); //test toString
        System.out.printf("Nazivu: %s%n", bojovnik.jeZivy());
        System.out.printf("Zivot: %s%n", bojovnik.grafickyZivot());

        //bojovnik.utoc(bojovnik);
        //System.out.printf("Zivot po utoku: %s%n", bojovnik.grafickyZivot());

        Bojovnik souper = new Bojovnik("Shadow", 60, 18, 15, kostka);
        souper.utoc(bojovnik);
        System.out.println(souper.vratPosledniZpravu());
        System.out.println(bojovnik.vratPosledniZpravu());

        System.out.printf("Zivot bojovnika %s: %s%n",bojovnik, bojovnik.grafickyZivot());


    }
}

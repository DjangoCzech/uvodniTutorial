package hra;

public class Bojovnik {
    private String name;
    private int zivot;
    private int maximalniZivot;
    private int utok;
    private int obrana;
    private Kostka kostka;
    private String zprava;

    public Bojovnik(String name, int zivot, int utok, int obrana, Kostka kostka) {
        this.name = name;
        this.zivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kostka = kostka;
        this.maximalniZivot = zivot;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean jeZivy(){
        if(zivot > 0){
            return true;
        } else {
            return false;
        }
    }

    public String grafickyZivot(){
        String grafickyZivot = "[";
        int celkem = 20;
        double pocetDilku = Math.round(((double) zivot / maximalniZivot) * celkem);
        if ((pocetDilku == 0) && (jeZivy())){
            pocetDilku = 1;
        }
        for (int i = 0; i < pocetDilku; i++) {
            grafickyZivot += "#";
        }
        for (int i = 0; i < celkem - pocetDilku; i++) {
            grafickyZivot += " ";
        }
        grafickyZivot += "]";
        return grafickyZivot;
    }
}

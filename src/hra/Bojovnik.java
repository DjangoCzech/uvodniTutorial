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

    public void branSe(int uder){
        int zraneni = uder - (obrana + kostka.hod());
        if(zraneni > 0){
            zivot -= zraneni;
            zprava = String.format("%s utrpel poskozeni %s hp", name, zraneni);
            if (zivot<=0){
                zivot = 0;
                zprava += " a zemrel";
            }
        } else {
            zprava = String.format("%s odrazil utok", name);
        }
        nastavZpravu(zprava);
    }

    public void utoc(Bojovnik souper){
        int uder = utok + kostka.hod();
        nastavZpravu(String.format("%s utoci s uderem za %s hp", name, uder));
        souper.branSe(uder);
    }

    private void nastavZpravu(String zprava){
        this.zprava = zprava;
    }
    public String vratPosledniZpravu(){
        return zprava;
    }
}

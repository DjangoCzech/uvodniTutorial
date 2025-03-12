package hra;

public class Mag extends Bojovnik {
    private int mana;
    private int maximalniMana;
    private int magickyUtok;


    public Mag(String name, int zivot, int utok, int obrana, Kostka kostka, int mana, int magickyUtok) {
        super(name, zivot, utok, obrana, kostka);
        this.mana = mana;
        this.maximalniMana = mana;
        this.magickyUtok = magickyUtok;
    }

    @Override
    public void utoc(Bojovnik souper){
        //int uder = 0;
        //Mana neni naplnena
        if (mana < maximalniMana) {
            mana+=10;
            if (mana>maximalniMana) {
                mana=maximalniMana;
            }
            super.utoc(souper);
            //uder = utok+kostka.hod();
            //nastavZpravu(String.format("%s utoci s uderem za %s hp", name, uder));
        } else {//Magicky utok
            int uder = magickyUtok + kostka.hod();
            nastavZpravu(String.format("%s pouzil magii za %s hp", name, uder));
            souper.branSe(uder);
            mana = 0;
        }
        //souper.branSe(uder);
    }

    public String grafickaMana(){
        return grafickyUkazatel(mana, maximalniMana);
    }
}

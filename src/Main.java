import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

//        int sum = 5;
//        byte age = 25;
//        char gender = 'M';
//        boolean married = false;
//        double height = 1.54;
//        float weight = 78.53f;
//        char color = 'A';
//        short s = 1000;
//
//        String s1 = "hello";
//
//        sum = sum + 5;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = sc.nextLine();
//        System.out.println("Jmeno je " + name);

        //Pole
        int[] cisla;
        //alokace pameti pro deset prvku
        cisla = new int[10];
        //inicializace
        cisla[0] = 100;
        cisla[1] = 200;
        cisla[2] = 300;

        System.out.println("Prvek na pozici 0: " + cisla[0]);

//        byte[] poleByte;
//        float[] poleFloat;
//        String[] poleString = new String[10];
//
//
//        String poleString2[];

//        String[][] names = {
//                {"Jan", "Karel", "Jarda"},
//                {"Jana", "Monika"}
//        };
//
//        System.out.println("Jmeno: " + names[0][0] + ", " + names[1][0]);
//        //copy
//        String[] copyFrom = {"Jan", "Karel", "Jarda", "Monika", "Marcela"};
//        String[] copyTo = new String[3];
//        System.arraycopy(copyFrom, 0, copyTo, 0, 3);
//
//        for(String name: copyTo){
//            System.out.println(name + " ");
//        }

        //Klicove slovo var
//        var message = "Jak se mate?";
//        var cislo = 65;
//
//        //IF-ELSE
//        int testscore = 76;
//        char grade;
//
//        if (testscore >= 96) {
//            grade = 'A';
//        } else if (testscore >= 80) {
//            grade = 'B';
//        } else if (testscore >= 70) {
//            grade = 'C';
//        } else if (testscore >= 60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("Grade: " + grade);

        //cykly
        //while statement

//        int count = 1;
//        while (count < 11) {
//            System.out.println("Pocet je " + count );
//            count++;
//        }
//
//        //while s podminkou na konci
//        int counta = 1;
//        do {
//            System.out.println("Pocet je " + counta);
//            counta++;
//        } while (counta < 11);
//
//        //FOR cyklus
//        for (int i = 0; i < 0; i++) {
//            System.out.println("Pocet je " + i);
//        }
//
//        //nekonecny cyklus
//        for (;;){
//            //vas kod
//            count++;
//            if (count == 100) {
//                System.out.println("Ukoncili jsme cyklus " + count);
//                break;
//            }
//        }
//
//        //kolekce
//        int[] numbers = {1,2,3,4,5,6,7,8,9};
//        for (int item: numbers) {
//            System.out.println("Polozka: " + item);
//        }
//
//        //SWITCH statement
//        int cisloMesice = 1;
//        String mesic;
//        switch (cisloMesice) {
//            case 1: mesic = "Leden";
//                break;
//            case 2: mesic = "Unor";
//                break;
//            case 3: mesic = "Brezen";
//                break;
//            default: mesic = "Neexistujici mesic";
//        }


//Kolekce

        List<String> seznam = new ArrayList<>();

        seznam.add("Jablko");
        seznam.add("Hruska");
        seznam.add("Pomeranc");

        System.out.println("Cely seznam: " + seznam);

        String druhyPrvek = seznam.get(1);
        System.out.println("Druhy: " + druhyPrvek);

        //Odstranit prvek
        //seznam.remove(1);
        //seznam.remove("Pomeranc");

        //Pridat prvek - na konkretni hodnotu pridat novy prvek
        seznam.set(1, "Banan");
        System.out.println("Cely seznam: " + seznam);

        List<String> seznamLinked  = new LinkedList<>();

        //prochazet
        for(String prvek: seznam) {
            System.out.println("Prvek: " + prvek);
        }

        //Map
        Map<String, Integer> cenyOvoceny = new HashMap<>();
        cenyOvoceny.put("Jablka", 25);
        cenyOvoceny.put("Hruska", 35);
        cenyOvoceny.put("Pomeranc", 40);

        //int cenaJablko = cenyOvoceny.get("Jablko");

        for(Map.Entry<String, Integer> entry: cenyOvoceny.entrySet()) {
            String klic = entry.getKey();
            Integer hodnota = entry.getValue();
            System.out.printf(klic + " -> " + hodnota);
        }


        //String
        String s1 = "Ahoj";
        String s2 = new String("Ahoj");

        //porovnavame vcetne reference
        if (s1 == s2) {
            System.out.println("Obsah stejny");
        }

        //porovnavame obsah
        if (s1.equals(s2)) {
            System.out.println("Obsah stejny");
        }

//        String text = "Ahoj, jak se mas?";
//        System.out.println("Delka textu: " + text.length());
//        System.out.println("Velka pismena: " + text.toUpperCase());
//        System.out.println("Mala pismena: " + text.toLowerCase());
//        System.out.println("Podretezec: " + text.substring(6)); //"jak se mas?"
//        System.out.println("Podretezec: " + text.substring(6,3));//"jak"
//        System.out.println("Pozice: " + text.indexOf("jak")); //6

        //StringBuilder
        //StringBuffer - pro praci s vlakny (vylepsena synchronizace)

//        StringBuilder sb = new StringBuilder();
//        sb.append("Ahoj");
//        sb.append(" jak");
//        sb.append(" mas?");
//        System.out.println(sb.toString());
//
//        try {
//            int[] pole = {1,2,3};
//            System.out.println(pole[5]); //vyvola IndexOutOfBoundException
//            int vysledek = 10/0; //vyvola ArithmeticException
//        } catch (ArithmeticException ex) {
//            System.out.println(ex.getMessage());
//            System.out.println("Zrejme probehlo deleni nulou");
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Chyba: index mimo rozsah pole" + ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//
//        } finally {
//            System.out.println("Zachytili jsme vsechny vyjimky");
//        }
//
//
//        try {
//            nacistSoubor("cesta.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Bicycle speedBicycle = new Bicycle(30);
        System.out.println("Rychlost kola: " + speedBicycle.speed);
        speedBicycle.speedUp(3);
        System.out.println("Rychlost kola: " + speedBicycle.speed);


    }

//    public static void nacistSoubor(String cesta) throws IOException {
//        FileReader fr = new FileReader(cesta);
//    }




}







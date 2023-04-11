
package gozzi;

import java.util.Scanner;

/**
 *
 * @author Alessandro Gozzi
 */
public class HraHadaniCisla {
    
    private static final Scanner sc = new Scanner(System.in);
    private static int horniMez = 100;
    private static int max = 100;
    private static int minimum = 100;
    
    
    
    
    
    
    public static void main(String[] args) {
        boolean konecProgramu = false;
        while (!konecProgramu) {
            vypisMenu();
            int volba = nactiVolbu();
            switch (volba) {
                case 0:
                    konecProgramu = true;
                    break;
                case 1:
                    hratHruHracHadaProgramMysli();
                    break;
                case 2:
                    hratHruHracMysliCisloProgramHada();
                    break;
                case 3:
                    zmenaNastaveni();
                    break;
                default:
                    System.out.println("Chybne zadana volba");
            }
        }
        System.out.println("Koncim ...");
    }

    private static void vypisMenu() {
        System.out.println("");
        System.out.println("Hra hadani cisla");
        System.out.println("1. Budu hadat");
        System.out.println("2. Budu si myslet cislo, pocitac at hada");
        System.out.println("3. Nastaveni");
        System.out.println("0. Konec programu");
    }

    private static int nactiVolbu() {
        System.out.print("Zadej volbu: ");
        int volba = sc.nextInt();
        return volba;
    }

    private static void hratHruHracHadaProgramMysli() {
        System.out.println("");
        System.out.println("Myslim si cislo, budes hadat");
        System.out.format("Cislo je v intervalu od 1 do %d%n", horniMez);
        int mysleneCislo = (int) (Math.random() * horniMez) + 1; // 1 .. 100
        int pocetTipu = 0;
        int tip;
        do {
            System.out.print("Zadej tip: ");
            tip = sc.nextInt();
            pocetTipu++;
            if (mysleneCislo < tip) 
                System.out.println("Uber");
            else if (mysleneCislo > tip) 
                System.out.println("Pridej");
            else
                System.out.println("Ok, uhadl jsi je to " + mysleneCislo);
        } while (tip != mysleneCislo);
        System.out.println("Potreboval jsi " + pocetTipu + " pokusu");
    }

    private static void hratHruHracMysliCisloProgramHada() {
        System.out.println("");
        System.out.format("Mysli si cislo v intervalu od 1 do %d%n.", horniMez);
        System.out.println("Pocitac bude hadat");
        String start;
        String zacatek;
        do {
        System.out.println("Az budete pripraveni napiste start.");
        start = sc.nextLine();
        zacatek = "start";
        }
        while (!start.equals(zacatek));
        //pocitac tipuje
        int a = (int) (Math.random() * horniMez) + 1;
        boolean spravnosti = false;
        String odpoved;
        String vic = "vic";
        String min = "min";
        String spravne2 = "spravne";
        int pocetpokusu = 1;
        while (spravnosti == false) {
            System.out.println("Pocitac si tipnul cislo "+a+".<----------");
            System.out.println("Je to spravne?");
            System.out.println("Napiste jednu ze tri moznosti.");
            System.out.println("Bud -> spravne, min, vic");
            odpoved = sc.nextLine();
            if (odpoved.equals(vic)) {
                minimum = a;
                a = (int) (Math.random() * (max-minimum+1)) + minimum;
                pocetpokusu++;
            } else if (odpoved.equals(min)) {
                max = a;
                a = (int) (Math.random() * (max-minimum+1)) + minimum;
                pocetpokusu++;
            } else if (odpoved.equals(spravne2)) {
                System.out.println("Pocitac to uhodl za "+pocetpokusu+" pokusu.");
                spravnosti = true;
            } else {
                System.out.println("Zadali jste spatnou odpoved.");
                System.out.println("Zadejte jedno -> spravne, min, vic");
            }
        }
        System.out.println("Kolo skoncilo.");

        
        
    }

    private static void zmenaNastaveni() {
        System.out.println("Aktualni horni mez je nastavena na "+horniMez+".");
        System.out.println("Napiste novou hodnotu. Maximum je 1000000");
        int p = sc.nextInt();
        if (p > 1000000) {
            do {
                System.out.println("Cislo je moc velke. Limit je 1000000.");
                p = sc.nextInt();
            }
            while (p > 1000000);
        }
        horniMez = p;
        System.out.println("Horni mez uspesne zmenena.");
        // vypis aktualni horni meze
        // nacist novou hodnotu
        // v pripade platneho zadani (od 10 do 1000000) pouzit
    }
    
}

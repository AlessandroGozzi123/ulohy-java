
package gozzi;

import java.util.Scanner;

/**
 *
 * @author Alessandro Gozzi
 */
public class TestAritmetickePosloupnosti {
    
    public static final Scanner sc = new Scanner(System.in);
    
    
    
    
    
    
    public static void main(String[] args) {
        
        int pocet;
        int soucet = 0;
        int prvniclen;
        int soucetvsechclenu;
        int cislo = 0;
        System.out.println("Zadejte pocet hodnot aritmeticke posloupnosti.");
        pocet = sc.nextInt();
        System.out.println("Muzete zadavat cleny po jednom.");
        for (int i = 1; i <= pocet; i++) {
            cislo = sc.nextInt();
            soucet = soucet+cislo;
            
        }
        prvniclen = ((soucet*2)/pocet)-cislo;
        soucetvsechclenu = (pocet*(prvniclen+cislo))/2;
        if (soucetvsechclenu == soucet) {
            System.out.println("Jedna se o aritmetickou posloupnost.");
        } else {
            System.out.println("Nejedna se o aritmetickou posloupnost.");
        }
        
        
        
    }
    
}

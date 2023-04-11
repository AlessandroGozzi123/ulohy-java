
package gozzi;

import java.util.Scanner;

/**
 *
 * @author Alessandro Gozzi
 */
public class PocetVyskytuMaxima {
    
    public static final Scanner sc = new Scanner(System.in);
    
    
    
    
    public static void main(String[] args) {
        
        System.out.println("Zadejte cela kladna cisla.");
        System.out.println("Cyklus se da ukoncit 0 nebo zapornym cislem.");
        int cislo;
        int n = 0;
        int m = 0;
        int h = 0;
        while ((cislo = sc.nextInt()) > 0) {
            if (cislo > n) {
                m = cislo;
                h = 1;
            }
            if (m == n) {
                h++;
            }
            n = cislo;
            
            
            
            
        }
        System.out.println("Nejvetsi cislo je "+m);
        System.out.println("Cislo se objevilo "+h+" krat.");
        
        
        
        
    }
    
}

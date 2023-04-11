
package gozzi;

import java.util.Scanner;

/**
 *
 * @author Alessandro Gozzi
 */
public class KalkulatorPro2 {
    public static final  Scanner sc = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
        char predAdOp = 'a';
        int vysledek = 0;
        char op = '5';
        System.out.println("Zadavejte znaky, po kazdym znaku enter.");    
        int cislo = sc.nextInt();
        int vyslMult = cislo;
        while (op != '=') {
            op = sc.next().charAt(0);
            if (op == '=') {
                switch (predAdOp) {
                    case '+':
                        vysledek = vysledek + vyslMult;
                        break;
                    case '-':
                        vysledek = vysledek - vyslMult;
                        break;
                }
                System.out.println("Vysledek je "+vysledek+".");
                break;
            } else if (op != '=') {
                cislo = sc.nextInt();
                if (op == '+' || op == '-') {
                    switch (op) {
                        case '+':
                            vysledek = vysledek + vyslMult;
                            break;
                        case '-':
                            vysledek = vysledek - vyslMult;
                            break;
                    }
                    predAdOp = op;
                    vyslMult = cislo;
                }
                else if (op == '/' || op == '*') {
                    switch (op) {
                        case '/':
                            vyslMult=vyslMult/cislo;
                            break;
                        case '*':
                            vyslMult=vyslMult*cislo;
                            break;
                    }
                }
            }
        }
        
        
        
        
        
    }
    
}

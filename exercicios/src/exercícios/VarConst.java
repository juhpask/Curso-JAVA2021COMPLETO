
package exercícios;

/**
 *
 * @author Ravs
 */
import java.util.Scanner;
public class VarConst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Transformar temperaturas Farenheit em Celsius
        Scanner scan = new Scanner(System.in);
        final int ajuste = 32;
        final double fator = 5/9.0;
        double f;
        double c;
        
        System.out.println("Informe a temperatura em F: ");
        f = scan.nextDouble();
                
        c = (f - ajuste) * fator;
        
        System.out.println("A temperatura em Celsius é: " + c + "°.");
        
        scan.close();
    }
    
    
}

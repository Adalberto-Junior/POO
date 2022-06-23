package NovaPasta.treino;
import java.util.Scanner;
public class parOuImpar {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int par, imp, result;
       
        do {
            System.out.print("Bino: ");
            par = sc.nextInt();
        } while ( 0 < par & par > 10);
        do {
            System.out.print("Cino: ");
            imp = sc.nextInt();
        } while ( 0 < imp & imp > 10);
         result = par + imp;
        if(result % 2 == 0)
          System.out.println("Bino");
        else
          System.out.println("Cino");
        sc.close();
        
    }
    
}

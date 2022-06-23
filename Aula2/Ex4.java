package Aula2;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double investido, taxa, montanteFinal;
        System.out.println("Qual o montante investido?");
        investido = sc.nextDouble();
        System.out.println("Qual a taxa de juro mensal?");
        taxa = sc.nextDouble();
        taxa = taxa / 100;
        double montant0 = investido + (investido * taxa);
        double montant1 = montant0  + (montant0  * taxa);
        montanteFinal   = montant1  + (montant1  * taxa);
        System.out.printf("o montante ao fim de 3 meses será de %f euros", montanteFinal);
        sc.close();


        
    }
    
}

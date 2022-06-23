package Aula3;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double investido, taxa;
        double mont[] = new double[13];
        do{
            System.out.print("Qual o montante investido(Positivo e multiplo de 1000)?");
            investido = sc.nextDouble();
        }while(investido < 0 || investido % 1000 != 0);

       do{
            System.out.print("Qual a taxa de juro mensal[0.5]?");
            taxa = sc.nextDouble();
       }while(taxa < 0 || taxa > 5);
        taxa = taxa / 100;

        mont[0] = investido + (investido * taxa);
        for(int i = 1; i < mont.length; i++){
            mont[i] = mont[i-1] + (mont[i-1] * taxa);
        }
        System.out.println("o valor mensal do fundo nos próximos 12 meses"); 
        for(int i = 0; i <= mont.length - 1; i++ ){
            System.out.printf(" mes %d = %f euros\n", i, mont[i]);   
        }
        sc.close();


        
    }
    
}

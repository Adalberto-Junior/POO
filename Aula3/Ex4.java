package Aula3;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double Num, max, min, media, soma, first;
        int cont = 1;
        System.out.print("Numero? (para terminar volta a colocar o primeiro Número): ");
        first = sc.nextDouble();
        max = first;
        min = first;
        soma = first;
        do{
            System.out.print("Numero? (para terminar volta a colocar o primeiro Número): ");
            Num = sc.nextDouble();
            if(Num != first){
                if(max < Num)
                   max = Num;
                if(min > Num)
                   min = Num;
                soma += Num;
                cont++;
            }
        }while(Num != first);
        media = soma / cont;
        System.out.println("Valor máximo = " + max);
        System.out.println("Valor mínimo = " + min);
        System.out.println("Média = " + media);
        System.out.println("Total de números lidos = " + cont);
        
        sc.close();
    }
}

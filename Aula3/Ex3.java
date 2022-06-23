package Aula3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num, cont = 0;
        do{
            System.out.print("Introduza um Número(Posítivo > 0): ");
            Num = sc.nextInt();
        }while(Num <= 0);
        for(int i = 1; i <= Num; i++){
            if(Num % i == 0)
              cont++;
        }
        if(cont == 2)
          System.out.printf("Número %d é primo!", Num);
        else
          System.out.printf("Número %d não é primo!", Num);
        
          sc.close();
    }
}

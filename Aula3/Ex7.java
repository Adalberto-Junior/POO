package Aula3;

import java.util.Scanner;
import java.util.Random;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random gr = new Random();
        
        int Num, N, resul, result;
        int cont = 0;
        String continuar;

        do{
            Num = gr.nextInt(100) + 1;
            do{
                System.out.print("Qaual é o Número?: ");
                N = sc.nextInt();
                if(N > Num){
                    System.out.println("Demasiado alta...");
                }else if(N == Num){
                    System.out.println("Acertou...");
                }else{
                    System.out.println("Demasiado baixa...");
                }   
                cont++;
            }while(N != Num);
            System.out.printf("Foram feitas %d tentativas\n", cont);
            System.out.print("Pretende continuar? Prima(S)im: ");
            continuar = sc.next();
            cont = 0;
             result = continuar.compareTo("S"); 
             resul  = continuar.compareTo("Sim");
        }while(result == 0 || resul == 0);
       sc.close();

    }
    
}

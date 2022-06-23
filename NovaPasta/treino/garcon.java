package NovaPasta.treino;

import java.util.Scanner;

public class garcon {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N, L, C, i = 0, cnt = 0;
        do {
            System.out.print("Número de bandeja: ");
              N = sc.nextInt();
        } while ( 1 < N & N > 100);
         int ar[][] = new int [N][2];
        do {
            do {
                System.out.print("Números de Latas: ");
                 L = sc.nextInt();
            } while (  0 < L & L > 100);
            do {
                System.out.print("Números de copos: ");
                 C = sc.nextInt();
            } while (  0 < C & C > 100);
            ar[i][0] = L;
            ar[i][1] = C;
            i++;
        } while (i < N );

       for(int j = 0; j < N; j++){
          if(ar[j][0] > ar[j][1])
          cnt += ar[j][1];  
       }
       System.out.print("O número total de copos que o garçom quebrou: "+ cnt);
        sc.close();        
        

    }
}

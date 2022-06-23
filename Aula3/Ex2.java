package Aula3;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Introduza o número: ");
        N = sc.nextInt();

        for(int i = N; i >= 0; i--)
           System.out.println(i);
        sc.close();
    }
    
}

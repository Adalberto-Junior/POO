package Aula2;
import java.util.Scanner;
import java.lang.Math;
public class Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A, B, C, AG;
        System.out.println("Dados do triângulo:");
        System.out.print("Cateto oposto, A?:  ");
        A = sc.nextDouble();
        System.out.print("Cateto adjacente, B?: ");
        B = sc.nextDouble();
        C = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));
        AG = Math.toDegrees(Math.acos(A / C));
        System.out.printf("Hipotenusa do Triangulo é %.2f\n", C);
        System.out.printf("O Angulo entre o lado A e C é %.2f graus", AG); 
       

        sc.close();
    }
    
}

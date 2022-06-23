package Aula2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double C, F;
        System.out.println("Conversor de Temperatura...(C to F) ");
        System.out.println("Introduza valor em Graus Célcius");
        C = sc.nextDouble();
        F = 1.8 * C + 32; 
        System.out.println("Valor em Fahrenheit: " + F);
        sc.close();
    }
    
}

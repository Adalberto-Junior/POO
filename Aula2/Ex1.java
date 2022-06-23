package Aula2;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        double km = 0.0;
        System.out.println("Conversor de Distância em Km para Milhas");
        System.out.println("Distância em quilómetros? ");
        km = sc.nextDouble();
        double milhas = km / 1.609; 
        System.out.printf("%f km = %f milhas", km, milhas);
        sc.close();
    }
    
}

package Aula2;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double M, iT, fT, Q; // M --> quantidade de água, iT --> initialTemperature, fT -->  finalTemperature , Q --> Energia;
        System.out.println("Quantidade de Água (Kg?)");
        M = sc.nextDouble();
        System.out.println("initialTemperature(iT)?");
        iT = sc.nextDouble();
        System.out.println("finalTemperature(fT)?");
        fT = sc.nextDouble();
        Q = M * (fT - iT) * 4184;

        System.out.println("Dados de entrada:");
        System.out.printf("Quantidade de água: %.2f kg\n iT: %.2f C\n fT: %.2f C\n", M, iT, fT);
        System.out.printf("A energia necessária para aquecer a água é %.2f J", Q);
        sc.close();

    }
    
}

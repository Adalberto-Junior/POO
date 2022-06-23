package Aula2;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double v1, v2, d1, d2, t1, t2, Vm; // velocidade(v1 e v2); distância(d1 e d2); tempo(t1 e t2); Vm - velocidade media final;
        System.out.println("Dados do ponto A");
        System.out.print("Velocidade(v1)?: ");
        v1 = sc.nextDouble();
        System.out.print("Distância(d1)?:  ");
        d1 = sc.nextDouble();
        System.out.println("Dados do ponto B:");
        System.out.print("Velocidade(v2)?: ");
        v2 = sc.nextDouble(); 
        System.out.print("Distância(d2)?: ");
        d2 = sc.nextDouble();
        // calculo do tempo: 
        t1 = d1 / v1; // 
        t2 = d2 / v2;
    
        //calculo davariação do tempo  e distância;
        double Vt = t1 + t2;  // Vt = variação do tempo;
        double Vd = d1 + d2; // variação da distância;

        // calculo da velocidade media final;
        Vm = Vd / Vt; 

        System.out.printf("A velocidade média final é %.2f m/s", Vm);
        sc.close();



        
    }
    
}

package Aula3;
import java.util.Scanner;
import java.lang.Math;
public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double notaT = -1;
        double notaP = -1;
        double notaF;
        do{
            System.out.print("Nota teorica?(arredondadas às décima): ");
            notaT = sc.nextDouble();
        }while(notaT < 0 || notaT > 20);
        do{
            System.out.print("Nota Pratica?(arredondadas às décima): ");
            notaP = sc.nextDouble();
        }while(notaP < 0 || notaP > 20);

        if(notaT < 7.0 || notaP < 7.0){
            notaF = 66;
            System.out.printf("Nota Final: %.0f --> Aluno reprovado por nota mínima", notaF);
        }else{
            notaF = Math.round(0.4 * notaT + 0.6 * notaP);
            if(notaF >= 10)
              System.out.printf("Nota Final: %.0f --> Aprovado", notaF);
            else
                System.out.printf("Nota Final: %.0f --> Reprovado", notaF);
        }
        sc.close();

    }
    
}

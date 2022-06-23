package Aula2;
import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, d;
        System.out.println("As coordenadas do Primeiro ponto: P1");
        System.out.print("x1?: ");
        x1 = sc.nextDouble();
        System.out.print("y1?: ");
        y1 = sc.nextDouble();
        System.out.println("As coordenadas do segundo ponto: P2");
        System.out.print("x2?: ");
        x2 = sc.nextDouble();
        System.out.print("y2?: ");
        y2 = sc.nextDouble();
        //double Vx = (x2 - x1) * (x2 - x1); // Vx = Variação do x;
        double Vx = Math.pow((x2-x1), 2);
        double Vy = Math.pow((y2 - y1), 2); // vy = variação do y;
        d = Math.sqrt(Vx + Vy);
        System.out.printf("A dintância entre o ponto p1 e p2 é %.2f m", d);
        sc.close();

    }
    
}

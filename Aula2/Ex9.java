package Aula2;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val;
        do{ 
            System.out.println("Calculadora....");
            double x, y, z;
            String op;
            System.out.print("Introduza o primeiro operando: ");
            x = sc.nextDouble();
            System.out.print("Introduza o segundo operando: ");
            y = sc.nextDouble();
            System.out.print("Introduza a operação: ");
            op = sc.next();
            switch (op) {
                case "x":
                    z = x * y;    
                    System.out.printf("%.1f %s %.1f = %.1f\n", x, op, y, z);           
                    break;
                case "*":
                    z = x * y;    
                    System.out.printf("%.1f %s %.1f = %.1f\n", x, op, y, z);           
                    break;
                case "/":
                    z = x / y;
                    System.out.printf("%.1f %s %.1f = %.1f\n", x, op, y, z);
                    break;
                case "+":
                    z = x + y;
                    System.out.printf("%.1f %s %.1f = %.1f\n", x, op, y, z);
                    break;
                case "-":
                    z = x - y;
                    System.out.printf("%.1f %s %.1f = %.1f\n", x, op, y, z);
                    break;
                case "%":
                        z = x % y; 
                        System.out.printf("%.1f %s %.1f = %.1f\n", x, op, y, z);
                    break;
                default:
                    z = 0;
                       System.out.println("Operação indisponível, só estão disponiveis: * / + - ");
                    break;
            }
            System.out.println(" click 1 to continue with the calculator or 0 to end....");
            val = sc.nextInt();
        }while(val == 1);
        if(val == 0){
            System.out.println("Finished!");
        }else{
            System.out.println("ERROR....");
            System.out.println("End!");
        }
        sc.close();
    }
    
}

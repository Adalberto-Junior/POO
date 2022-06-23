package Aula5;

import java.util.Scanner;

public class testeCalendario {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Calendario nossaSenhora = new Calendario();
        int op;
        do {
            System.out.println("Calendaroperations:\n1 - create new calendar\n2 - print calendar month\n3 - print calendar\n0 – exit\n");
            System.out.print("-->");
             op = sc.nextInt();
             switch (op) {
                 case 1:
                        System.out.println("Create new Calendar!");
                        System.out.print("Ano: ");
                        int ano = sc.nextInt();
                        System.out.print("Dia da semana que começa o ano!(1-D...7-S): ");
                        int diaS = sc.nextInt();
                        nossaSenhora = new Calendario(ano, diaS);
                    break;
                 case 2: 
                        System.out.print("Qual mes deseja imprimir?(1-Jane...12-Deze): ");
                        int mes = sc.nextInt();
                        String printe = nossaSenhora.printMonth(mes);
                        System.out.println(printe);
                    break;
                 case 3:
                        System.out.println(nossaSenhora.toString());
                    break;
                 case 0: 
                        System.out.println("good job!");
                    break;
                 default:
                         System.out.println("Op invalido...");
                     break;
             }
        } while (op != 0);
        sc.close();

    }
}

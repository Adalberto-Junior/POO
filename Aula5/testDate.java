package Aula5;

import java.util.Scanner;

public class testDate {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Date data = new Date();
        int op;
        do {
            System.out.println("Date operations:\n 1 -create new date\n 2 -show current date\n 3 -increment date\n 4 -decrement date\n 0 -exit");
            System.out.print("-->");
            op = sc.nextInt();
            System.out.println();
            switch (op) {
                case 1:
                       String dateIn;
                       int year, month, day;
                       System.out.println("Date please? format(AAAA-MM-DD)");
                        dateIn = sc.next();

                       String dateAr[] = dateIn.split("-");
                       if(dateAr[0].length() == 0){
                           year = 0;
                       }
                       else{
                        year  = Integer.parseInt(dateAr[0]);
                       }
                       month = Integer.parseInt(dateAr[1]);
                       day   = Integer.parseInt(dateAr[2]); 
                       data.set(day, month,year);
                    break;
                case 2:
                        data.print(); 
                    break; 
                case 3: 
                        data.increment();
                    break;
                case 4:
                       data.decrement();
                    break;
                case 0:
                    break;
            }
            
        } while (op != 0);
    }
}

package Aula3;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String data;
        int dia, mes, ano;
        do{

            System.out.print("Introduza a data(m/aaaa): ");
            data = sc.next();
            String date[] = data.split("/");
            mes = Integer.parseInt(date[0]);
            ano = Integer.parseInt(date[1]);
            if((mes <= 0 || mes > 31))
                System.out.printf("Data inválida! não existe mes = %d\n", mes);
            if(ano < 0)
                System.out.printf("Data inválida! Não existe ano %d\n", ano);

        }while((mes <= 0 || mes > 31) || ano < 0);
       
        switch (mes) {
            case 2:
                  if((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) )
                    dia = 29;
                  else 
                    dia = 28;
                break;
            case 4: case 6: case 9: case 11:
                    dia = 30;
                break;       
            default:
                    dia = 31;
                break;
        }
        System.out.printf("O mes %d do ano %d tem %d dias", mes, ano, dia); 
        
        sc.close();



    }
}

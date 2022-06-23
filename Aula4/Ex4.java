package Aula4;
import java.util.Scanner;
public class Ex4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
     print();
    }
    public static String readDate(){
        String date;
        System.out.println("Introduza a data(dd/mm/aaaa): ");
        date = sc.nextLine();
        return date;
    }
    public static int[] dayCalculetor (){
        int diaS, diaT,  mes, ano;  // diaS -> dias de semana; diaT -> numero total de dia do mes;
        int day[] = new int [4];  // day[] -> array para diaS, diaT, mes e ano;
        String date;
        boolean valido;
        do{
            date= readDate();
            String data [] = date.split("/");
            diaS = Integer.parseInt(data[0]);
            mes = Integer.parseInt(data[1]);
            ano = Integer.parseInt(data[2]);
            valido = Validado(diaS, mes, ano);
        }while(!valido);

        switch (mes) {
            case 2:
                  if((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) )
                    diaT = 29;
                  else 
                    diaT = 28;
                break;
            case 4: case 6: case 9: case 11:
                    diaT = 30;
                break;       
            default:
                    diaT = 31;
                break;
        }
        day[0] = diaS;  
        day[1] = diaT;
        day[2] = mes;
        day[3] = ano;
        
        return day;
    }
    public static void print(){

        int diaS, diaT, mes, ano, count = 0, i = 1;  
        boolean jumb = false;
        int day [] = new int [4];
        int dayr[] = new int[7];
        String weekday[] = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
        
        day = dayCalculetor(); 
        diaS = day[0];
        diaT = day[1];
        mes  = day[2];
        ano  = day[3];

        System.out.println("   "+ mesExtenso(mes) + " " + ano);

        for(int k = 0; k < weekday.length; k++){
            System.out.printf("%2s ", weekday[k]);
        }
        System.out.println();
        do {
            for(int j = diaS; j <= 7; j++){
                dayr[j-1] = i;
                i++;
                if(i > diaT)
                  break;
            }
            for(int j = diaS; j <= 7; j++){
                switch (diaS) {
                    case 2:
                            if(count == 0 && !jumb)
                                System.out.printf("   %2d ", dayr[j-1]);
                            else
                                System.out.printf("%2d ", dayr[j-1]);
                        break;
                    case 3:
                            if(count == 0 && !jumb)
                                System.out.printf("      %2d ", dayr[j-1]);
                            else
                                System.out.printf("%2d ", dayr[j-1]);
                        break;
                    case 4:
                            if(count == 0 && !jumb)
                                 System.out.printf("         %2d ", dayr[j-1]);
                            else
                                 System.out.printf("%2d ", dayr[j-1]);
                        break;
                    case 5:
                            if(count == 0 && !jumb)
                                System.out.printf("            %2d ", dayr[j-1]);
                            else
                                System.out.printf("%2d ", dayr[j-1]);
                        break;
                    case 6:
                            if(count == 0 && !jumb)
                                System.out.printf("               %2d ", dayr[j-1]);
                            else
                                System.out.printf("%2d ", dayr[j-1]);
                        break;
                    case 7:
                            if(count == 0 && !jumb)
                                System.out.printf("                  %2d ", dayr[j-1]);
                            else
                                System.out.printf("%2d ", dayr[j-1]);
                        break;
                
                    default:
                            System.out.printf("%2d ", dayr[j-1]);
                        break;
                }
                count = 1;
                if(dayr[j-1] == diaT)
                    break;
            }
            System.out.print("\n");
            diaS = 1;
            jumb = true;
            
        } while (i <= diaT);
    }
    //Funções auxiliares
    public static boolean Validado(int dia, int mes, int ano){
        boolean valido;
        if((dia > 0 && dia < 8) && (mes > 0 && mes <= 31) && ano >= 0);
            valido = true;
        return valido;
    }
    public static String mesExtenso(int mes){
       String mesEx[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
       return mesEx[mes-1];
    }
}

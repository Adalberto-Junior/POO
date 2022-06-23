package Aula4;
import java.util.Scanner;

public class TimeToLIve {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        print();
    }
    public static String[] ReadData(){
        String data[] = new String [2];
        String nome, idade;
        System.out.print("What is your name?: ");
        nome= sc.nextLine();
        System.out.print("how old are you?: ");
        idade = sc.nextLine();
        data[0] = nome;
        data[1] = idade;
        return data;
    }
    public static int age(){
        String data[] = ReadData();
        int age = Integer.parseInt(data[1]);
        return age;
    }
    public static int MonthOfLife(int age){
        return age * 12;
    }
    public static int hoursOfYears(int age){
        int hoursOfYears;
        hoursOfYears = 365 * 24;
       hoursOfYears *= age;
        return hoursOfYears;
    }
    public static int dayOfYears(){
        int age = age();
        return age * 365;
    }
    public static int[] timeSliping(){
        int hour, timeSlipingr[] = new int [2];
        int timeSliping = dayOfYears() * 8;
        timeSliping /= 24;
        hour = (timeSliping % 24) * 24;
        timeSlipingr[0] = timeSliping;
        timeSlipingr[1] = hour;

        return timeSlipingr;
    }
    public static int[] dayEating(){
        int dayOfYears = dayOfYears();
        int timesEating = 90 * dayOfYears;
        int hour = (timesEating % 1440) * 24;
        timesEating /= 1440; 
        int dayEating [] = new int [2];
        dayEating[0] = timesEating;
        dayEating[1] = hour;
        return dayEating;        
    }
    public static int[] dayBath(){
        int dayOfYears = dayOfYears();
        int timesBath = 60 * dayOfYears;
        int hour = (timesBath % 1440) * 24;
        timesBath /= 1440;
        int dayBath[] = new int[2];
        dayBath[0] = timesBath;
        dayBath[1] = hour;
        return dayBath;
    }
    // função para organizar os dados e gardar no documento; Fazer outras alteraçoes. 
    public static String[] organizar() {
        String dados[] = new String[9];
        String data[] = ReadData();
        int age = age();
        String mesDvida  = Integer.toString(MonthOfLife(age));
        String horaDvida = Integer.toString(hoursOfYears(age));
        String diaDvida  = Integer.toString(dayOfYears());

        int timesSlip[] = timeSliping();
        String timeSliping = Integer.toString(timesSlip[0]);
        String timeSlipingh = Integer.toString(timesSlip[1]);

        int tempocom[] = dayEating();
        String tempoC = Integer.toString(tempocom[0]);
        String tempoCh = Integer.toString(tempocom[1]);

        int diadorm[] = dayBath();
        String banho = Integer.toString(diadorm[0]);
        String banhoh = Integer.toString(diadorm[1]); 

        dados[0] = "Nome: " + data[0];
        dados[1] = "Idade: " + data[1];
        dados[2] = "Mes total de vida: " + mesDvida;
        dados[3] = "Dia total de vida: " + diaDvida;
        dados[4] = "Hora total de vida: " + horaDvida;
        dados[5] = "Tempo total a dormir: " + timeSliping + " anos" + " e " + timeSlipingh + "horas";
        dados[6] = "Tempo total a comer: " + tempoC + " anos " + "e " + tempoCh + " horas";
        dados[7] = "Tempo total a tomar banho: " + banho + " anos " + "e " + banhoh + " horas";
        dados[8] = "\n";
        
        return dados;
    }
    public static void print(){
        String dados[] = organizar();
        for(String u: dados)
           System.out.println(u);
    }

}

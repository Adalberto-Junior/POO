package Aula5;

public class Calendario {
    private Date data = new Date();
    private int dayOfWeek;
    private int dayOfweekJan;
    //construtores:
    public Calendario(int year, int dayOfWeek){
        valid(dayOfWeek);
        data.setYear(year);
        data.setMonth(1);
        data.setDay(1);
        this.dayOfweekJan = dayOfWeek;
    }
    public Calendario(){}
    //metodos para alterar as variaves;
    public int year(){return data.getYear();}
    public int firstWeekdayOfYear(){return dayOfweekJan;}
    public int firstWeekdayOfMonth(int month){
        if(month == 1)
          return firstWeekdayOfYear();
        else{
          this.dayOfWeek = firstWeekdayOfAllMonth(month);
          return dayOfWeek;
          //System.out.println("c:"+ String.valueOf(firstWeekdayOfAllMonth(month)));
           // return firstWeekdayOfAllMonth(month);
    }
    }

    //metodos prints;

    // printMonth e toString são codigos fonte de um colega meu; os meus não estavam a funcionar.
    //Com ajuda dele consegui este.
    public String printMonth(int month){
         String s = "\n";
         s += "   " + mesExtenso(month) + " " + this.data.getYear() + "\n";
         int totalDay = monthDays(month, data.getYear());
         s += "Su Mo Tu We Th Fr Sa" + "\n";
         for(int i = 1; i < this.dayOfWeek ; i++){
        //for(int i = 1; i <  firstWeekdayOfAllMonth(month); i++){
            s += "   ";       //dias em branco
        }
        int aux = firstWeekdayOfMonth(month);//- 1;   // firstWeekdayofMonth(month) retorna o primeiro dia do respetivo mes;
        System.out.println("a:"+ String.valueOf(aux));
        for(int i = 1; i <= totalDay; i++){
            s += String.format("%2d ",i);
           
            if(aux == 7){
                aux = 0;
                s += "\n";
            }
            aux++;
        }
        return s + "\n";
    }
    public String toString(){
        String s = "";
        for(int i = 1; i<=12; i++){
            if(i == 1){
                s += String.format(printMonth(1));
                s += "\n";
            }else{
                
                s += String.format(printMonth(i));
                s += "\n";
            }
        }

        return s;
    }
    
    //metodos auxiliares;
    private static String mesExtenso(int month){
        String mesEx[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return mesEx[month-1];
    }
    private int lastDayOfWeekJan(){  //ultimo dia da semana do Janeiro;

        int aux = this.dayOfWeek;
       
       int totalDay = monthDays(1, data.getYear());
         
       for(int i = 1; i <= totalDay; i++){
           if(aux == 7){
               aux = 0;
           }
           aux++;
       }
       
       return aux;  //Primeiro dia da semana de fevereiro;
    }
    //recebe o mes anterior, e  primeiro dia do mesmo mes;
    private int firstDayOfWeek(int month, int temp){  //primeiro dia de messes 3 a 12; 
        int aux;
        System.out.print("b1:"+ String.valueOf(temp));
        System.out.println();
        int totalDay = monthDays(month, data.getYear());
        aux = temp;
       for(int i = 1; i <= totalDay; i++){
           if(aux == 7+1){
               aux = 0;
           }
           aux++;
       }
       System.out.println("b2:"+ String.valueOf(aux));
       return aux;  // returna o primeiro dia do mes pedido
    }
    private int firstWeekdayOfAllMonth(int month){  //metodo para retornar os primeiros dias do meses 2 a 12;
        int keep[] = new int [11];
        int temp, aux = lastDayOfWeekJan();  // primeiro dia do fevereiro;
        keep[0] = aux;
    
        for(int j = 1; j < 11; j++){
            temp = firstDayOfWeek(j+1, keep[j-1]);
            keep[j] = temp;
        }
        System.out.println(keep[month-2]);
        return keep[month-2];
    }
    private static boolean valid(int dayOfWeek){
        return dayOfWeek >= 1 && dayOfWeek <= 7;
    }
    private static int monthDays(int month, int year){
        int day;
        if(Date.validMonth(month)){
            switch (month) {
                case 2:
                    if(Date.leapYear(year))
                        day = 29;
                    else 
                        day = 28;
                    break;
                case 4: case 6: case 9: case 11:
                        day = 30;
                    break;       
                default:
                        day = 31;
                    break;
            }
            return day;
        }
        return -7;
        

     }


}

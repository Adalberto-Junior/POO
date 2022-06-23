package Aula4;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Introduza uma frase");
          frase = sc.nextLine();
          
        System.out.println("Acronimo: " + acronimo(frase));
        sc.close();
    }
    public static String acronimo (String s){
        String temp = "";
        String frase[] = s.split(" ");
        char c;
        
        for(int i = 0; i < frase.length; i++){
            if(frase[i].length() > 3){
                 c = frase[i].charAt(0);
                 c = Character.toUpperCase(c);
                temp += Character.toString(c);
            }
        }
        return temp;
    }
}

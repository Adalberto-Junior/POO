package Aula3;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String cor, nome,col, temp, temp1 = "";

        System.out.println("Qual o Nome?");
        nome = sc.nextLine();
        System.out.print("O que queres substituir?: ");
        cor = sc.next();
        System.out.print("O que queres colocar: ");
        col = sc.next();

        char c = cor.charAt(0); // caracter a substituir;
        char co = col.charAt(0); // novo caracter para colocar;

        for(int i = 0; i < nome.length(); i++){
            char sub = nome.charAt(i);
            if(sub == c)
              sub = co;
            temp = Character.toString(sub); 
            temp1 += temp;
        }
        System.out.println(temp1);
        sc.close();
    }
    
}

package Aula3;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cor, frase,col, temp = "";
        System.out.println("Qual o Nome?");
        frase = sc.next();
        System.out.print("Onde queres separar?: ");
        cor = sc.next();
        System.out.print("O que queres colocar: ");
        col = sc.next();
        String arr[] = frase.split(cor);
        for(int i = 0; i < arr.length-1; i++){
           temp += arr[i] + col + arr[i+1] ;
        }
        System.out.println(temp);
        sc.close();
    }
    
}

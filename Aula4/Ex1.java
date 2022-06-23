package Aula4;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("String, please?: ");
        word = sc.nextLine();
        System.out.println(" String convertida para minúsculas =  " + word.toLowerCase());
        System.out.println(" O ultimo carater da Frase =  "+ word.charAt(word.length()-1));
        System.out.println("Os tres primeiros carateres = " + word.subSequence(0, 3));
        System.out.println("String replace a por Z = " + word.replace('a','Z'));
        System.out.println("String concat = " + word.concat(word.substring(0, 3)));
        System.out.print("A frase contem x?: ");
        System.out.println( word.contains("x")? "YES":"NO");
        sc.close();

    }
}

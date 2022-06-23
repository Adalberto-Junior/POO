package Aula4;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Sentence please?--> ");
        frase = sc.nextLine();
        System.out.println("The number of numeric characters in the sentence are: " + countDigits(frase));
        System.out.println("The number of spaces in the sentence are: " + countSpace(frase));
        System.out.println(justLowerCase(frase)? "only contain lowercase letters!" : "Does not contain only lowercase letters!");
        System.out.println(isPalindrome(frase)? " it's palindrome!" : "it's not palindrome!" );
        System.out.println("several spaces in a row are replaced by a single space!--> " + justASpace(frase));

        sc.close();
    }
    public static int countDigits(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
           if(Character.isDigit(s.charAt(i)))
              count++;
        }
        return count;
    }
    public static int countSpace(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
          if(Character.isWhitespace(s.charAt(i)))
              count++;
        }
        return count;
    }
    public static boolean justLowerCase(String s){
        String temp;
        temp = s.toLowerCase();
        return temp.equals(s);
    }
    public static boolean isPalindrome(String s){
        String temp = "";
        char c; 
        for(int i = s.length()-1; i > -1; i--){
            c = s.charAt(i);
            temp += Character.toString(c);
        }
        return s.equals(temp);
    }
    public static String justASpace(String s){
        String temp = "";
        char c;
        int placedSpace  = 0;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(!Character.isWhitespace(c)){
                temp += Character.toString(c);
                placedSpace = 0;
            }
            else{
                if(placedSpace == 0)
                    temp += " ";
                    placedSpace = 1;
            }  
        }
        return temp;
    }
}

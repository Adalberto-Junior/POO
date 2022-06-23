package NovaPasta.treino;

import java.io.*;
import java.util.Scanner;
public class openFicheiro {
    public static void main(String[]args){
        try(Scanner in = new Scanner(new File("Adalberto.txt"))) {
            int soma = 0, cnt = 0;
            double media = 0;
            while(in.hasNext()){
                String word = in.next();
                soma += Integer.parseInt(word);
                cnt++; 
                /*
                if(word.equals("abacateiros"))
                  System.out.println(word);
                else
                System.out.println("Paz: " + in.next());
                */
            }
            if(cnt > 0)
               media = soma / cnt;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media); 

        }catch(FileNotFoundException e){
            System.out.println("Ficheiro não existente!");
        } catch (Exception e) {
            System.out.println("Err: " + e);
            //TODO: handle exception
        }
          
    }
    
}

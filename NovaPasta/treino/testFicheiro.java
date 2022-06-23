package NovaPasta.treino;
import java.util.Scanner;
import java.io.*;

public class testFicheiro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("O nome do ficheiro \\'.txt'");
        String input = sc.next();
        File in = new File(input);
        
        try(PrintWriter out = new PrintWriter(in)) {
            //out.println("Todos os Numeros Primos de 1 a 1000: ");
            for(int i = 1; i <= 1000; i++ ){
                int cnt = 0;
                for(int j = 1; j <= 1000; j++ ){
                    if(i % j == 0)
                      cnt++;
                }
                if(cnt == 2){
                    out.println(i);
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não existente!");
            //TODO: handle exception
        }catch(Exception e){
            System.out.println("Err: " + e);
        }
        sc.close();

    }
    
}

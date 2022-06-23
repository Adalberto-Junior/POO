package Aula2;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int s, m, h;
      System.out.println("Qual o segundo?");
      s = sc.nextInt();
      h = s / 3600;
      m = (s % 3600) / 60;
      s = (s % 3600) % 60;
      System.out.printf("%d:%d:%d", h, m, s);
      sc.close();

    }
    
}

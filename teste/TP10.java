package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.Iterator;

public class TP10 {
    public static void main(String[]args){
        List<Integer> lista = new ArrayList<>();

        for(int i = 1000; i > 0; i--)
          lista.add(i);
        Collections.sort(lista);
        lista.forEach(System.out::println);
        String[] vec = new String[] { "once", "upon", "a", "time", "in", "Aveiro" };
        Arrays.sort(vec);
        for (String s : vec) System.out.print(s);
        System.out.println();

        try(Scanner input = new Scanner(new File("Adalberto.txt"));){
            List<Integer> list = new ArrayList<>();
            while(input.hasNext()){
                   String numero = input.next();
                   list.add(Integer.parseInt(numero));
                 }
                 Iterator<Integer> i = list.iterator();
                 while(i.hasNext()){
                        System.out.println(i.next());
                       }
                 //int a[] = new int [100];
                Integer[] array = list.toArray(new Integer[1]);
                 Arrays.sort(array);
                 int max = array[array.length - 1], min = array[0], soma = 0; double media = 0;
                  for(int j = 0; j < array.length; j++){
                        soma += array[j];
                     }
                  media = soma / array.length;
                  File fl = new File("números_stat.txt");
                  if(!fl.exists())
                     fl.createNewFile();
                  if(!fl.canWrite())
                     System.out.println("Ficheiro não pode ser editado!");
                   FileWriter fw = new FileWriter(fl, false);
                   PrintWriter pw = new PrintWriter(fw);
                   pw.println("mim:" + min);
                   pw.println("max:" + max);
                   pw.println("media:" + media);
                   pw.close();
          }catch(FileNotFoundException e){
                System.out.println("Ficheiro não encontado");
          }catch(Exception e){
              System.out.println(e);
          }
    }

    
}

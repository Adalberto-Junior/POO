package teste;
import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;

public class test {
    public static void main(String[]args){

        try(Scanner input = new Scanner(new File("aluno.txt"))) {
            Aluno alu[] = new Aluno[3];
            int indx = 0;
            while(input.hasNextLine()){
                String aluno = input.nextLine();
                String ar[] = aluno.split("\t");
                int mec = Integer.parseInt(ar[0]);
                int cc = Integer.parseInt(ar[2]);
                String dataNas[] = ar[3].split("/");
                int anoNas = Integer.parseInt(dataNas[2]);
                int mesNas = Integer.parseInt(dataNas[1]);
                int diaNas = Integer.parseInt(dataNas[0]);
                // datas de inscrição:
                String dataIns[] = ar[4].split("/");
                int anoIns = Integer.parseInt(dataIns[2]);
                int mesIns = Integer.parseInt(dataIns[1]);
                int diaIns = Integer.parseInt(dataIns[0]);

                alu[indx] = new Aluno(ar[1], cc, new DateYMD(diaNas, mesNas, anoNas), new DateYMD(diaIns, mesIns, anoIns));
                alu[indx].setNMec(mec);
                indx++;
            }
            Set<Aluno> set = new TreeSet<>();
            for(Aluno a : alu){
                set.add(a);
            }
            File sf = new File("Escola.txt");
                       
            if(!sf.exists())
              sf.createNewFile();
             if(!sf.canWrite())
               System.out.println("Arquivo não pode ser lido");
             FileWriter wf = new FileWriter(sf, false);
             PrintWriter pw = new PrintWriter(wf);
             Iterator <Aluno> i = set.iterator();
            while(i.hasNext()){
                pw.println(i.next());
             }
             pw.close();;

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}

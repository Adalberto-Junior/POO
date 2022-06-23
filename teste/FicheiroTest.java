package teste;
//import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class FicheiroTest {
    public static void main(String[]args) throws IOException{
        //Scanner input = new Scanner(new File("scr/"));
        File diretorio = new File("src/");
        File arquivo[] = diretorio.listFiles();
        for(File list: arquivo){
            System.out.println(list.getName());
        }
        List<String> list = Files.readAllLines(Paths.get("major.txt"));
        for(String ln : list){
            System.out.println(ln);
        }
        String livro = "livro.pdf";
        RandomAccessFile rf = new RandomAccessFile(livro, "r");
        for(int i = 0; i < rf.length(); i++){
            //System.out.println(rf.readUTF());
            rf.seek(i*4);
        }
         

        rf.close();
        

    }
    
}

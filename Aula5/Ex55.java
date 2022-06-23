package Aula5;
import java.util.Scanner;
import java.io.*;
public class Ex55 {
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int op, i = 0, ind= 0;
        Livro catalogo[] = new Livro[100];
        Utilizador alunos[] = new Utilizador[100];
          //int k[] = Arrays.copyOf(original, newLength)
        do {
            System.out.println("Menu!");
            System.out.println(" 1- inscrever utilizador\n 2- remover utilizador\n 3- imprimir lista de utilizadores\n" +  
            " 4- registar um novo livro\n 5- imprimir lista de livros\n 6- emprestar\n 7- devolver\n 8- guardar dados no ficheiro.txt\n 9- sair\n");
            
            System.out.print("-->");
              op = sc.nextInt();

            switch (op) {
                case 1:
                       System.out.println("Escolha a opcão de escrita: ");
                       System.out.println("0 - para escrever numa só linha\n1 - para escrever cada campo\nCaso clicar em outras op, sera usado op por default\n");
                       System.out.print("-->");
                       int opr = sc.nextInt();

                       sc.nextLine();

                       String nome, curso; int nMec;
                       switch (opr) {
                           case 0:
                                  System.out.println(" Deve ser no formato--> (nMec Nome UltNome curso) ou (nMec nome curso) somente um espaço!");
                                  System.out.print("-->");
                                  String dados = sc.nextLine();

                                  String dado[] = dados.split(" ");

                                  nMec = Integer.parseInt(dado[0]);

                                  if(dado.length == 4){
                                    nome = dado[1] + " " + dado[2];
                                    curso = dado[3];
                                  }
                                  else{
                                    nome = dado[1];
                                    curso = dado[2];
                                  }
                               break;
                           default:
                                    System.out.print("nMec: ");
                                      nMec = sc.nextInt();
                                      sc.nextLine();
                                    System.out.print("Nome: ");
                                      nome =sc.nextLine();
                                    System.out.print("curso: ");
                                      curso = sc.nextLine();
                               break;
                       }
                       alunos[ind] = new Utilizador(nome, nMec, curso);
                       ind++;
                    break;
                case 2:
                          System.out.print("o nMec do utilizador a ser removido:-->  ");
                            int mec = sc.nextInt();
                       /* for(int j = 0; j < alunos.length; j++){

                            if(alunos[j].getnMec() == mec){
                              /*for(int x = j; x < alunos.length; x++){
                                if(alunos[x] != null)
                                  alunos[x] = alunos[x+1];
                              }
                              alunos[j] = null;
                            }
                        }
                        int count = 0;
                        int size = alunos.length;
                        Utilizador alunosCopy[]; 
                        for(int j = 0; j < alunos.length; j++){
                           if(alunos[j] != null)
                             count++;
                        }
                        /**
                        for(int j = 0; j < alunos.length; j++){
                          if(alunos[j].getnMec() == mec){
                            alunosCopy = new Utilizador[alunos.length-1]; 
                            for(int k = j; k < j; k++ ){
                              alunosCopy[k] = alunos[k];
                            }
                            for(int index = j; index < alunos.length-1; index++){
                               alunosCopy[index] = alunos[index+1];
                            }
                            //alunos = null;
                            /*
                            for(int index = 0; index < alunosCopy.length; index++){
                              alunos[index] = alunosCopy[index];
                            }
                            alunos = Arrays.copyOf(alunosCopy, size);
                          }
                        }*/
                        for(int j = 0; j < alunos.length; j++){
                          if(alunos[j] != null){
                            if(alunos[j].getnMec() == mec){
                              for(int k = j; k < alunos.length-1; k++){
                                 if(alunos[k+1] == null)
                                    alunos[k] = null;
                                  else 
                                    alunos[k] = alunos[k+1];
                              }
                              ind--;
                           }
                          } 
                        }
                    break;
                case 3:
                       for(int u = 0; u < alunos.length; u++){ 
                          if(alunos[u] != null)  
                            System.out.println(alunos[u]);
                        }
                    break;
                case 4:
                      sc.nextLine();

                       System.out.print("formato(Titulo, tipoEmpresto)---> ");
                       String temp = sc.nextLine();
                       String auxTemp[] = temp.split(", ");
                       catalogo[i] = new Livro(auxTemp[0], auxTemp[1]);
                       i++;
                    break;
                case 5: 
                        for(int j = 0; j < catalogo.length; j++){
                            if(catalogo[j] != null )
                              System.out.println(catalogo[j]);
                        }
                    break;
                case 6:
                        int idEmp, nMen;
                        System.out.println("o Id do livro a emprestar?");
                          idEmp = sc.nextInt();
                        System.out.print("nMec do aluno: \n");
                          nMen = sc.nextInt();

                          for(int j = 0; j < i; j++){
                            if(idEmp == catalogo[j].getId()){
                              if(catalogo[j].getEmprestimo() == true){
                                for(int l = 0; l < ind; l++){
                                  if(alunos[l].getnMec() == nMen){
                                    if(alunos[l].getI() <= 3){
                                      alunos[l].setEmprest(catalogo[j]);
                                      System.out.println("Livro Emprestado: " + alunos[l] + alunos[l].getEmprestimo());
                                      catalogo[j].setTipoEmprestimo("CONDICIONAL");
                                      break;
                                    }else{
                                      System.out.println("Utilizador não pode fazer mais emprestimo, no Maximo 3!");
                                      System.out.println("Posições livres: " + alunos[l].getEmprestimo());
                                    }
                                  }else{
                                    System.out.println("Utilizador não registado!...");
                                  }
                                }
                              }else{
                                 System.out.println("Livro indisponivel!");
                              }
  
                            }else{
                               System.out.println("Nenhum livro registado com este ID!");
                            }
                          }

                    break;
                case 7:
                        // devolver;
                        /*
                          fazer a operação inverso;
                          receber o nMec do Aluno e Id do livro a devolver, a seguir ir a classe Livro e alterar tudo para o normal.
                          e na classe Utilizadopr modificar o aluno de forma que fique tudo normal;
                        */
                        int idEmpr, nMep;
                        System.out.println("o Id do livro a devolver?");
                          idEmpr = sc.nextInt();
                        System.out.print("nMec do aluno: \n");
                          nMep = sc.nextInt();

                        for(int j = 0; j < i; j++){
                          if(idEmpr == catalogo[j].getId()){
                            for(int l = 0; l < ind; l++){
                              if(alunos[l].getnMec() == nMep){
                                if(alunos[l].getEmprestimo() !=null){
                                  alunos[l].devolver(idEmpr);
                                  catalogo[j].setTipoEmprestimo("NORMAL");
                                  System.out.println("Devolvido com sucesso o livro:"+ catalogo[j]);
                                }
                              }
                            }
                          }
                        }
                    break;
                case 8:
                       File sf = new File("Biblioteca.txt");
                       
                       if(!sf.exists())
                         sf.createNewFile();
                        if(!sf.canWrite())
                          System.out.println("Arquivo não pode ser lido");
                        FileWriter wf = new FileWriter(sf, true);
                        PrintWriter pw = new PrintWriter(wf);
                        for(int j = 0; j < alunos.length; j++){
                          if(alunos[j] != null)
                           pw.println(alunos[j]);
                          if(catalogo[j] != null)
                           pw.println(catalogo[j]);
                        }
                        pw.close();;
                    break;
                case 9:
                        System.out.println("good job!");
                       break;
            }
        } while (op != 9);

        sc.close();


    }
    
}

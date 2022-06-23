package Aula5;

public class Utilizador {
        private String nome;
        private int nMec;
        private String curso;
        private Livro emprestimo[] = new Livro[3];
        private  int i = 0;
    public Utilizador(String nome, int nMec, String curso){
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }
    public Utilizador(){}
    public void setnMec(int nMec){this.nMec = nMec;}
    public void setNome(String nome){this.nome = nome;}
    public void setCurso(String curso){this.curso = curso;}
    public String getNome(){return nome;}
    public int getnMec(){return nMec;}
    public String getCurso(){return curso;}
    public Livro[] getEmprestimo(){return emprestimo;}
    public Utilizador get(){return this;}
    public String toString(){
        return  "Aluno: " + nMec + ", " + nome + ", " + curso + ", " + emprestimo[0] + "\n" + "\t\t\t" + emprestimo[1] + "\n" + "\t\t\t" + emprestimo[2]; 
    }
    public void setEmprest(Livro emprestado){
        if(this.emprestimo.length <= 3){
            this.emprestimo[this.i] = emprestado;
            this.i++;
        } 
    }
    public void devolver(int ID){
        for(int k = 0; k < this.emprestimo.length; k++){
            if(this.emprestimo[k] != null){
                if(this.emprestimo[k].getId() == ID){
                  for(int x = k; x < this.emprestimo.length-1; x++){
                      if(this.emprestimo[x+1] == null)
                        this.emprestimo[x] = null;
                      else
                        this.emprestimo[x] = this.emprestimo[x+1];
                    } 
                    i--;
               }
            }
        }
        
    }
    
    public int getI(){return i;}
    
}

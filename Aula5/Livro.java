package Aula5;

public class Livro {
        private int id;
        private static int count = 100;
        private String titulo;
        private String tipoEmprestimo;
        private static boolean emprestimo;

    public Livro(){}
    public Livro(String titulo, String tipoEmprestimo){
        this.id = count;
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        count++;
        if(tipoEmprestimo.equals("NORMAL"))
           emprestimo = true;
        else
           emprestimo = false;      
    }
    public Livro(String titulo){
        this.id = count;
        this.titulo = titulo;
        count++;
    }
    public int getId(){
        return this.id;
    }
    public String getTitulo(){return titulo;}
    public String getTipoEmprestimo(){return tipoEmprestimo;}
    public boolean getEmprestimo(){return emprestimo;}
    public Livro get(){return this;}
    public void setTipoEmprestimo(String tipoEmprestimo){
        this.tipoEmprestimo = tipoEmprestimo;
        if(tipoEmprestimo.equals("NORMAL"))
          emprestimo = true;
        else
          emprestimo = false;
    }
    public String toString(){
        return "Livro " + id + ", " + titulo + ", " + tipoEmprestimo;//  + "," + emprestimo; 
    }
   
}

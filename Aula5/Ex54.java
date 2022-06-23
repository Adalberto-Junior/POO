package Aula5;

import java.util.ArrayList;

public class Ex54 {
    public static void main(String[] args) {
        Livro catalogo[] = new Livro[10];
        catalogo[0] = new Livro("Java 8", "CONDICIONAL");
        catalogo[1] = new Livro("POO em Java 8", "NORMAL");
        catalogo[2] = new Livro("Java para totós");
        System.out.println("ID = "+ catalogo[1].getId() + ", "+ catalogo[1].getTitulo());
        catalogo[2].setTipoEmprestimo("CONDICIONAL");
        for(int i= 0; i< catalogo.length; i++) { // usando o indice do vecto
            if(catalogo[i] != null) // porque o vector catalogo não está cheio
            System.out.println(catalogo[i]);
        }
        ArrayList<Utilizador> alunos= new ArrayList<>(); 
        alunos.add(new Utilizador("Catarina Marques", 80232, "MIEGI"));
        alunos.add(new Utilizador("Joao Silva", 90123, "LEI"));
        alunos.get(1).setnMec(80123);
        for(Utilizador u: alunos) { // usando foreach
            System.out.println(u);
        
        }
    }
}

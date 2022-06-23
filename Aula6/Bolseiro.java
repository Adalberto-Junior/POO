package Aula6;

import Aula5.Date;

public class Bolseiro extends Aluno {
       private int bolsa;
    
    public Bolseiro(String nome, int BI, Date dataNasc, Date dataInsc, int bolsa ){
       // super(nome, BI, dataNasc);
        super(nome, BI, dataNasc, dataInsc);
        this.bolsa = bolsa;
    }
    public Bolseiro(String nome, int BI, Date dataNasc, int bolsa ){
         super(nome, BI, dataNasc);
         this.bolsa = bolsa;
    }
    public void setBolsa(int bolsa){this.bolsa = bolsa;}
    public int getBolsa(){return bolsa;}
    @Override
    public String toString(){
        return "Bolsa: " + bolsa + ";";
    }
    
}

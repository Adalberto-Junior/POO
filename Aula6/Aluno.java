package Aula6;

import Aula5.Date;

public class Aluno extends Pessoa {
        private int mec;
        private Date dataInsc;
        private static int count = 100;
    public Aluno(String iNome, int iBI, Date iDataNasc, Date iDataInsc){
        super(iNome, iBI, iDataNasc);
        this.dataInsc = iDataInsc;
        this.mec = count;
        count++;
    }
    public Aluno(String iNome, int iBI, Date iDataNasc){
        super(iNome, iBI, iDataNasc);
        Date aux = new Date();
        this.dataInsc = aux;
        this.mec = count;
        count++;
    }
    public int getNMec(){return this.mec;}
    @Override
    public String toString(){
        return "Aluno: " + mec + "; " + super.toString() + " Data de inscricao: " + dataInsc + ";";   
    }

    
}

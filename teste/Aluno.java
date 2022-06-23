package teste;


public class Aluno extends Pessoa implements Comparable<Aluno> {
        private int mec;
        private DateYMD dataInsc;
        private static int count = 100;
    public Aluno(String iNome, int iBI, DateYMD iDataNasc, DateYMD iDataInsc){
        super(iNome, iBI, iDataNasc);
        this.dataInsc = iDataInsc;
        this.mec = count;
        count++;
    }
    public Aluno(String iNome, int iBI, DateYMD iDataNasc){
        super(iNome, iBI, iDataNasc);
        DateYMD aux = new DateYMD();
        this.dataInsc = aux;
        this.mec = count;
        count++;
    }
    public int getNMec(){return this.mec;}
    public void setNMec(int mec){this.mec = mec;}
    @Override
    public String toString(){
        return "Aluno: " + mec + "; " + super.toString() + " Data de inscricao: " + dataInsc + ";";   
    }
    public int compareTo(Aluno e) {
        // TODO Auto-generated method stub
        //DateYMD other = (DateYMD)o;
        return  this.mec - e.mec;
        }

    
}

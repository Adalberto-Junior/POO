package teste;

public class Pessoa {
        private String name;
        private int cc;
        private DateYMD dataNasc;
    
    public Pessoa(String name, int cc, DateYMD dataNasc){
        this.name = name;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }
    public void setName(String name){this.name = name;}
    public void setCc(int cc){this.cc = cc;}
    public void setDataNasc(DateYMD dataNasc){this.dataNasc = dataNasc;}
    public String getName(){return this.name;}
    public int getCc(){return this.cc;}
    public Date getDataNasc(){return this.dataNasc;}
    @Override
    public String toString(){
        return name + "; " + "CC: " + cc + "; " + "Data de Nascimento: " + dataNasc + ";";
    }
    
}

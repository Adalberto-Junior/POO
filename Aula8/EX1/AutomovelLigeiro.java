package Aula8.EX1;

public class AutomovelLigeiro extends Viatura {
    private int nQuadro;
    private int capBagageira;

    public AutomovelLigeiro(){}
    public AutomovelLigeiro(String matricula, String marca, String modelo, double potencia, int nQuadro, int capBagageira){
        super(matricula, modelo, marca, potencia);
        this.nQuadro = nQuadro;
        this.capBagageira = capBagageira;
    }
    //set 
    public void setNQuadro(int nQuadro){this.nQuadro = nQuadro;}
    public void setCapBagageira(int capBagageira){this.capBagageira = capBagageira;}
    //get
    public int getNQuadro(){return this.nQuadro;}
    public int getCapBagageira(){return this.capBagageira;}
    //
    @Override
    public String toString(){
        return super.toString() + "Número do Quadro: " + this.nQuadro + "\n" + "Capacidade da Bagageira: " + this.capBagageira + "\n";
    }
    @Override
    public boolean equals(Object objt){
        AutomovelLigeiro b = (AutomovelLigeiro) objt;
        return super.equals(objt) && this.nQuadro == b.nQuadro && this.capBagageira == b.capBagageira;
    }
}

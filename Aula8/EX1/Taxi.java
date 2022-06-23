package Aula8.EX1;

public class Taxi extends AutomovelLigeiro {
    private int nLicenca;

    public Taxi(){}
    public Taxi(String matricula, String marca, String modelo, double potencia, int nQuadro, int capBagageira, int nLicenca){
        super(matricula, marca, modelo, potencia, nQuadro, capBagageira);
        this.nLicenca = nLicenca;
    }
    //set
    public void setNLicenca(int nLicenca){this.nLicenca = nLicenca;}
    //get
    public int getNLicnca(){return this.nLicenca;}
    @Override
    public String toString(){
        return super.toString() + "Número de Licença: " + this.nLicenca + "\n";
    } 
    @Override
    public boolean equals(Object objt){
        Taxi b = (Taxi) objt;
        return super.equals(objt) && this.nLicenca == b.nLicenca; 
    }
}

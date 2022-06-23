package Aula8.EX1;

public class PesadoDePassageiro extends Viatura {
    private int nQuadro;
    private int peso;
    private int nMaxPassageiro;
    public PesadoDePassageiro(){}
    public PesadoDePassageiro(String matricula, String marca, String modelo, double potencia, int nQuadro, int peso, int nMaxPassageiro){
        super(matricula, modelo, marca, potencia);
        this.nMaxPassageiro = nMaxPassageiro;
        this.nQuadro = nQuadro;
        this.peso = peso;
    }
    public void setNQuadro(int nQuadro){this.nQuadro = nQuadro;}
    public void setPeso(int peso){this.peso = peso;}
    public void setCargaMaxima(int cargaMaxima){this.nMaxPassageiro = cargaMaxima;}
    //get
    public int getNQuadro(){return this.nQuadro;}
    public int getPeso(){return this.peso;}
    public int getCargaMaxima(){return this.nMaxPassageiro;}
    //
    @Override
    public String toString(){
        return super.toString() + "Número do Quadro: " + this.nQuadro + "\n" + "Peso: " + this.peso + "\n" + "Número Máximo de Passageiros: " + this.nMaxPassageiro + "\n";
    }
    @Override
    public boolean equals(Object objt){
        PesadoDePassageiro b = (PesadoDePassageiro) objt;
        return super.equals(objt) && this.nQuadro == b.nQuadro && this.peso == b.peso && this.nMaxPassageiro == b.nMaxPassageiro;
    }
    
}

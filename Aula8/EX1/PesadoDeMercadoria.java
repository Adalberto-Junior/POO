package Aula8.EX1;

public class PesadoDeMercadoria extends Viatura {
    private int nQuadro;
    private int peso;
    private int cargaMaxima;
    public PesadoDeMercadoria(){}
    public PesadoDeMercadoria(String matricula, String marca, String modelo, double potencia, int nQuadro, int peso, int cargaMaxima){
        super(matricula, modelo, marca, potencia);
        this.cargaMaxima = cargaMaxima;
        this.nQuadro = nQuadro;
        this.peso = peso;
    }
    public void setNQuadro(int nQuadro){this.nQuadro = nQuadro;}
    public void setPeso(int peso){this.peso = peso;}
    public void setCargaMaxima(int cargaMaxima){this.cargaMaxima = cargaMaxima;}
    //get
    public int getNQuadro(){return this.nQuadro;}
    public int getPeso(){return this.peso;}
    public int getCargaMaxima(){return this.cargaMaxima;}
    //
    @Override
    public String toString(){
        return super.toString() + "Número do Quadro: " + this.nQuadro + "\n" + "Peso: " + this.peso + "\n" + "Carga Maxima: " + this.cargaMaxima + "\n";
    }
    @Override
    public boolean equals(Object objt){
        PesadoDeMercadoria b = (PesadoDeMercadoria) objt;
        return super.equals(objt) && this.nQuadro == b.nQuadro && this.peso == b.peso && this.cargaMaxima == b.cargaMaxima;
    }
    
}

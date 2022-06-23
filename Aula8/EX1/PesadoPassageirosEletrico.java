package Aula8.EX1;

public class PesadoPassageirosEletrico extends PesadoDePassageiro implements VeiculoEletrico {
     
          private int carga = 100;

    public PesadoPassageirosEletrico(){}
    public PesadoPassageirosEletrico(String matricula, String marca, String modelo, double potencia, int nQuadro, int peso, int nMaxPassageiro){
        super(matricula, marca, modelo, potencia, nQuadro, peso, nMaxPassageiro);
    }
    public void carregar(int percentagem){
        System.out.println(this.carga);
        for(int i = 0; i <= percentagem; i++){
            System.out.print(".");
        }
        this.carga = percentagem;
        System.out.println("carregada");
    }
    public void cargaPorPercurso(int percurso){
        if(percurso % 100 == 0){
           int x = percurso / 100;
           this.carga -= x; 
        }
    }
    public int autonomia(){
        return this.carga; 
    }
    @Override
    public String toString(){
        return super.toString() + "Carga: " + this.carga;
    }
    @Override
    public boolean equals(Object objt){
        PesadoPassageirosEletrico b = (PesadoPassageirosEletrico) objt;
        return super.equals(objt) && this.carga == b.carga; 
    }

    
}

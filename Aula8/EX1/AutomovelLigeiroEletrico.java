package Aula8.EX1;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {
          
          private int carga = 100;

    public AutomovelLigeiroEletrico(){}
    public AutomovelLigeiroEletrico(String matricula, String marca, String modelo, double potencia, int nQuadro, int capBagageira){
        super(matricula, marca, modelo, potencia, nQuadro, capBagageira);
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
        AutomovelLigeiroEletrico b = (AutomovelLigeiroEletrico) objt;
        return super.equals(objt) && this.carga == b.carga; 
    }

    
}

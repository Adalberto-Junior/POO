package Aula8.Ex2;

public class AlimentoVegetariano extends Alimento {

    public AlimentoVegetariano(){}
    public AlimentoVegetariano(double proteina, double peso, double caloria){
        super(proteina, peso, caloria);
    }
    public void setProteina(double proteina){super.setProteina(proteina);}
    public void setPeso(double peso){super.setPeso(peso);}
    public void setCaloria(double caloria){super.setCaloria(caloria);}

    public double getProteina(){return super.getProteina();}
    public double getPeso(){return super.getPeso();}
    public double getCaloria(){return super.getCaloria();}

    @Override
    public String toString(){
        return super.toString() + "Vegetariano";
    }
    @Override
    public boolean equals(Object objt){
        return super.equals(objt);
    }
    @Override
    public int hashCode(){
         //final int n = 31;
        //int result = n + ((this.proteina == 0) ? 0 : 456)
        return super.hashCode();
    }
}

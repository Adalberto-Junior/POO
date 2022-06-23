package Aula8.Ex2;

public class Alimento {
    private double proteina;
    private double peso;
    private double caloria;
    
    public Alimento(){}
    public Alimento(double proteina, double peso, double caloria){
        this.proteina = proteina;
        this.peso = peso;
        this.caloria = caloria;
    }
    public void setProteina(double proteina){this.proteina = proteina;}
    public void setPeso(double peso){this.peso = peso;}
    public void setCaloria(double caloria){this.caloria = caloria;}

    public double getProteina(){return this.proteina;}
    public double getPeso(){return this.peso;}
    public double getCaloria(){return this.caloria;}
    
    
    @Override
    public String toString(){
        return String.format("Proteina: %.1f, Caloria: %.1f, Peso: %.1f", this.proteina, this.caloria, this.peso);
    }
    @Override
    public boolean equals(Object objt){
        if(this == objt)
            return true;
        if(objt == null)
            return false;
        if(this.getClass() != objt.getClass())
            return false;
        Alimento other = (Alimento) objt;
        if(this.proteina == 0){
            if(other.proteina != 0)
            return false;
        }else if(this.proteina != other.proteina)
            return false;
        if(this.caloria == 0){
            if(other.caloria != 0)
            return false;
        }else if(this.caloria != other.caloria)
            return false;
        if(this.peso == 0){
            if(other.peso != 0)
            return false;
        }else if(this.peso != other.peso)
            return false;
        return true;
    }
    @Override
    public int hashCode(){
         //final int n = 31;
        //int result = n + ((this.proteina == 0) ? 0 : 456);
        long temp = Double.doubleToLongBits(caloria);
        long temp1 = Double.doubleToLongBits(peso);
        long temp2 = Double.doubleToLongBits(caloria);
        int result = (int)(temp ^(temp >> 32)) * (int)(temp1 ^ (temp1 >> 32)) + (int)(temp2 ^(temp2 >> 32));
        return result;
    }
}

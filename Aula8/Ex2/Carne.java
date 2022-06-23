package Aula8.Ex2;

public class Carne extends Alimento {
    VariedadeCarne tipo;
    public Carne(){}
    public Carne(VariedadeCarne variedade, double proteina, double caloria, double peso ){
        super(proteina, peso, caloria);
        tipo = variedade;
    }
    @Override
    public String toString(){
        return "Carne " +  tipo + super.toString();
    }
    @Override 
    public boolean equals(Object objt){
        Carne b = (Carne) objt;
        return super.equals(objt) && this.tipo == b.tipo;
    }
    @Override
    public int hashCode(){
        String s = String.valueOf(tipo);
        long temp = Double.doubleToLongBits(s.length());
        return super.hashCode() + (int)(temp ^(temp >> 32));
    }


   
    
}

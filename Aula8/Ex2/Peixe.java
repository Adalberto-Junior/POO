package Aula8.Ex2;

public class Peixe extends Alimento {
     private TipoPeixe tipo;
    
    public Peixe(){}
    public Peixe(TipoPeixe tipo, double proteina, double caloria, double peso ){
        super(proteina, peso, caloria);
        this.tipo = tipo;
    }
    public TipoPeixe getTipo(){return this.tipo;}
    @Override
    public String toString(){
        return "Peixe " +  tipo + super.toString();
    }
    @Override 
    public boolean equals(Object objt){
        Peixe b = (Peixe) objt;
        return super.equals(objt) && this.tipo == b.tipo;
    }
    @Override
    public int hashCode(){
        String s = String.valueOf(tipo);
        long temp = Double.doubleToLongBits(s.length());
        return super.hashCode() + (int)(temp ^(temp >> 32));
    }

}

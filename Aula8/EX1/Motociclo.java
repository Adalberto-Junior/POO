package Aula8.EX1;

public class Motociclo extends Viatura {
    private String tipo;

    public Motociclo(){}
    public Motociclo(String matricula, String marca, String modelo, String tipo, double potencia){
        super(matricula, modelo, marca, potencia);
        this.tipo = tipo;
    }
    //set
    public void setTipo(String tipo){this.tipo = tipo;}
    //get
    public String getTipo(){return this.tipo;}
    @Override
    public String toString(){
        String r =  super.toString();
        r += "Tipo: " + this.tipo;
        return r; 
    }
    @Override
    public boolean equals(Object objt){
        return super.equals(objt) && this.tipo.equals(((Motociclo)objt).tipo);
    }
}

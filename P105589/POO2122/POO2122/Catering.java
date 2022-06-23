package P105589.POO2122.POO2122;

public class Catering extends Activity {
    private int cliente;
    Option modalidade;

    private final double preco = 25;
    
    public Catering(){}
    public Catering(Option modalidade, int cliente ){
        this.modalidade = modalidade;
        this.cliente = cliente;

    }
    public void setCliente(int cliente){this.cliente = cliente;}
    public int getCliente(){return this.cliente;}
    public double getPreco(){return preco;}
    @Override
    public String toString(){
        return modalidade + "for " + this.cliente + "participants.";
    }
    @Override
    public boolean equals(Object objt){
        if(this == objt)
            return true;
        if(objt == null)
            return false;
        if(this.getClass() != objt.getClass())
            return false;
            Catering other = (Catering)objt;
        return this.cliente == other.cliente && this.modalidade.equals(other.modalidade);
    
    }
public enum Option{
    LIGHT_BITES, FULL_MENU, DRINKS_AND_SNACKS
}
}

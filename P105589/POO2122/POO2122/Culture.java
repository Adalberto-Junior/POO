package P105589.POO2122.POO2122;

public class Culture extends Activity {
    private int cliente;
    Option modalidade;

    private final int preco = 22;
    
    public Culture(){}
    public Culture(Option modalidade, int cliente ){
        this.modalidade = modalidade;
        this.cliente = cliente;

    }
    public void setCliente(int cliente){this.cliente = cliente;}
    public int getCliente(){return this.cliente;}
    public double getPreco(){return preco;}
    @Override
    public String toString(){
        return modalidade + "with " + this.cliente + "participants.";
    }
    @Override
    public boolean equals(Object objt){
        if(this == objt)
            return true;
        if(objt == null)
            return false;
        if(this.getClass() != objt.getClass())
            return false;
            Culture other = (Culture)objt;
        return this.cliente == other.cliente && this.modalidade.equals(other.modalidade);
    
    }
public enum Option{
    ARCHITECTURAL_TOUR, RIVER_TOUR,ART_MUSEUM,WINE_TASTING
}
    
}

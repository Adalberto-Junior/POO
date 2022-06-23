package P105589.POO2122.POO2122;

public class Sport extends Activity {
    private int cliente;
    Modality modalidade;

    private final double preco = 30;
    
    public Sport(){}
    public Sport(Modality modalidade, int cliente ){
        this.modalidade = modalidade;
        this.cliente = cliente;

    }
    public void setCliente(int cliente){this.cliente = cliente;}
    public int getCliente(){return this.cliente;}
    public double getPreco(){return preco;}
    @Override
    public String toString(){
        return modalidade + "sporting activity whit " + this.cliente + "participants.";
    }
    @Override
    public boolean equals(Object objt){
        if(this == objt)
            return true;
        if(objt == null)
            return false;
        if(this.getClass() != objt.getClass())
            return false;
        Sport other = (Sport)objt;
        return this.cliente == other.cliente && this.modalidade.equals(other.modalidade);   
    }
  

public enum Modality{
    KAYAK, HIKING
}
}


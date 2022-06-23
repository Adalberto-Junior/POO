package P105589.POO2122.POO2122;

public class Client {
    private String nome;
    private String localidade;

    public Client(){
    }
    public Client(String nome, String localidade){
        this.nome = nome;
        this.localidade = localidade;
    }
    public void addClient(String nome, String localidade){
        this.nome = nome;
        this.localidade = localidade;
    }
    public String getNome(){return this.nome;}
    public String getLocalidade(){return this.localidade;}
    @Override
    public String toString(){
        return this.nome + "[" + this.localidade + "]";
    }
    @Override
    public boolean equals(Object objt){
        if(this == objt)
            return true;
        if(objt == null)
            return false;
        if(this.getClass() != objt.getClass())
            return false;
            Client other = (Client)objt;
        return this.nome.equals(other.nome) && this.localidade.equals(other.localidade);
    
    }


}

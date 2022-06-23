package Aula8.Ex2;

public class Prato  {
     private String nome;
     private Alimento[] poot;
     private static int index = 0;
     private static int size = 0;
    
    public Prato(){}
    public Prato(String nome, int length){
        this.nome = nome;
        this.poot = new Alimento[length];
    }
    public Prato(String nome){
        this.nome = nome;
        this.poot = new Alimento[100];
    }
    public void setProteina(double proteina, int i){poot[i].setProteina(proteina);}
    public void setPeso(double peso, int i){poot[i].setPeso(peso);}
    public void setCaloria(double caloria, int i){poot[i].setCaloria(caloria);}
    public void setNome(String nome){this.nome = nome;}
    public boolean addIngrediente(Alimento b){
        if(size <= poot.length){
           poot[index] = b;
           index++;
           size = index;
           return true;
        }
        else
           return false;

    }
    public double getProteina(int i){return poot[i].getProteina();}
    public double getPeso(int i){return poot[i].getPeso();}
    public double getCaloria(int i){return poot[i].getCaloria();}
    public Alimento getaAlimento(int i){
        return this.poot[i];
    }
    public String getNome(){return this.nome;}
    public String detalhePrato(int i){
        return poot[i].toString();
    }
    @Override
    public String toString(){
        return String.format("Prato %s, composto por %d Ingredientes", this.nome, size);
    }
    @Override
    public boolean equals(Object objt){
        Prato b = (Prato) objt;
        return poot.equals(objt) && this.nome.equals(b.nome);
    }
    @Override
    public int hashCode(){
        long temp = Double.doubleToLongBits(nome.length());
        return poot.hashCode() + (int)(temp ^(temp >> 32));
    }
}

package Aula8.Ex2;

public class Ementa {
    private String nome;
    private String local;
    private DiaSemana dia;
     private Prato[] poot;
     private static int index = 0;
     private static int size = 0;
     //private static int k = -1;
    
    public Ementa(){}
    public Ementa(String nome, String local){
        this.nome = nome;
        this.local = local;
        this.poot = new Prato[100];
    }
    public void setProteina(double proteina, int i){poot[i].setProteina(proteina, i);}
    public void setPeso(double peso, int i){poot[i].setPeso(peso, i);}
    public void setCaloria(double caloria, int i){poot[i].setCaloria(caloria, i);}
    public void setNome(String nome){this.nome = nome;}
    public void addPrato(Prato b, DiaSemana dia ){
        if(size <= poot.length){
           poot[index] = b;
           index++;
           size = index;
           this.dia = dia;
        }
    }
    public double getProteina(int i){return poot[i].getProteina(i);}
    public double getPeso(int i){return poot[i].getPeso(i);}
    public double getCaloria(int i){return poot[i].getCaloria(i);}
    public Prato getaAlimento(int i){
        return this.poot[i];
    }
    public String getNome(){return this.nome;}
    @Override
    public String toString(){
        //return String.format("Prato %s, composto por %d Ingredientes", this.nome, size);
         //k++;
         String s = "";
        for(int i = 0; i < size; i++){
          s += poot[i].toString() + "," + "Dia " + this.dia + "\n";
        }
        return s;
    }
    @Override
    public boolean equals(Object objt){
       Ementa b = (Ementa) objt;
        return poot.equals(objt) && this.nome.equals(b.nome) && this.local.equals(b.local) ;
    }
    @Override
    public int hashCode(){
        long temp = Double.doubleToLongBits(nome.length());
        long temp1 = Double.doubleToLongBits(local.length());
        return poot.hashCode() + (int)(temp ^(temp >> 32)) + (int)(temp1 ^(temp1 >> 32));
    }
    
}

package Aula8.EX1;

public class Viatura implements KmPercorridosInterface {
    private String matricula;
    private String modelo;
    private String marca;
    private double potencia;
    private int[] trajeto;
    private static int index = 0;
    private static int size = 0;;

    public Viatura(){}
    public Viatura(String matricula, String modelo, String marca, double potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.trajeto = new int[100];
    }
    //set
    public void setMatricula(String matricula){this.matricula = matricula;}
    public void setMarca(String marca){this.marca = marca;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setPotencia(double potencia){this.potencia = potencia;}
    //get
    public String getMatricula(){return this.matricula;}
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public double getPotencia(){return this.potencia;}

    public void trajeto(int quilometros){
           trajeto[index] = quilometros;
           index++;
           size = index;
    }
    public int ultimoTrajeto(){
        return trajeto[size - 1];
    } 
    public int distanciaTotal(){
      int distancia = 0;
      for(int i = 0; i < size; i++ ){
        distancia += trajeto[i];
      }
      return distancia;
        
    }
    public int maiorKmPercorido(){
          int max = 0;
          for(int i = 0; i < size; i++){
            if(max < trajeto[i])
                max = trajeto[i];
          }
          return max;
    }
    @Override
    public String toString(){
        String s = String.format("Viatura:\nMarca: %s\nModelo: %s\nPotencia: %.2f cv\nMatricula: %s\n ",this.marca, this.modelo, this.potencia, this.matricula);
        return s; 
    }
    @Override
    public boolean equals(Object objt){
      if(this == objt)
        return true;
      if(objt == null)
        return false;
      if(this.getClass() != objt.getClass())
        return false;
      Viatura other = (Viatura) objt;
      if(this.matricula == null){
        if(other.matricula != null)
          return false;
    }else if(!this.matricula.equals(other.matricula))
          return false;
    if(this.marca == null){
        if(other.marca != null)
          return false;
    }else if(!this.marca.equals(other.marca))
          return false;
    if(this.modelo == null){
        if(other.modelo != null)
          return false;
    }else if(!this.modelo.equals(other.modelo))
          return false;
    if(this.potencia == 0){
        if(other.potencia != 0)
          return false;
    }else if(this.potencia != other.potencia)
          return false;
    return true;
    }
}

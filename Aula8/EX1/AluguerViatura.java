package Aula8.EX1;

public class AluguerViatura {
    private String nome;
    private String cPostal;
    private String email; 
    private Viatura car[];
    private static int carIndx;

    public AluguerViatura(){}
    public AluguerViatura(String nome, String cPostal, String email, int length/*, Viatura car*/){
        this.nome = nome;
        this.cPostal = cPostal;
        this.email = email;
        //this.car = car;
        this.car = new Viatura[length];
        

    }
    public void setNome(String nome){this.nome = nome;}
    public void setCPostal(String cPostal){this.cPostal = cPostal;}
    public void setEmail(String email){this.email = email;}
    public void setCar(Viatura b){
        this.car[carIndx] = b;
        carIndx++;
    }
    //get
    public String getNome(){return this.nome;}
    public String getCPostal(){return this.cPostal;}
    public String getEmail(){return email;}
    public Viatura getCar(){
        Viatura x = new Viatura();
        for(Viatura u: this.car){
            x = u;
        }
        return x;
    }
    public Viatura getACar(int index){
       /*  if(this.Car[index] != null){
             Viatura x = car[index]
         }
       */
         return this.car[index];
    }
    public void trajeto(int km, int i){
          this.car[i].trajeto(km);
      }
    public int ultimoTrajeto(int i){
      return  this.car[i].ultimoTrajeto();  
    }
    public int distancia(int i){
          return this.car[i].distanciaTotal();
    }
    public int maxtrajeto(int i){
          return this.car[i].maiorKmPercorido();
    }
    /*public int descarga(int i){
      if((car[i] instanceof AutomovelLigeiroEletrico) || (car[i] instanceof PesadoPassageirosEletrico)){
        this.car[i].
      }
    }*/
        
    @Override
    public String toString(){
        Viatura x = new Viatura();
        for(Viatura u: this.car){
            if(u != null)
             x = u;
        }
        return "Agencia: " + this.nome + "\n" +  "Codigo postal: " + this.cPostal + "\n" + "Email: " + this.email + "\n" + "Car: " + x;
    }
    @Override
    public boolean equals(Object objt){
        if(this == objt)
          return true;
        if(objt == null)
          return false;
        if(this.getClass() != objt.getClass())
          return false;
          AluguerViatura other = (AluguerViatura) objt;
        if(this.nome == null){
            if(other.nome != null)
              return false;
        }else if(!this.nome.equals(other.nome))
              return false;
        if(this.cPostal == null){
            if(other.cPostal != null)
              return false;
        }else if(!this.cPostal.equals(other.cPostal))
              return false;
         if(this.email == null){
            if(other.email != null)
              return false;
        }else if(!this.email.equals(other.email))
              return false;
        return true;
    }
}

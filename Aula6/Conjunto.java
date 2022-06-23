package Aula6;

public class Conjunto {
    private int vetor[];
    private int indx;
    private int size;
    private int length;

    public Conjunto(){
        this.size = 0;
        this.indx = 0;
        this.length = 100;
        vetor = new int [length];
    }
    public int[] getVector (){return vetor;}
    public int size(){return this.size;}
    public void insert (int n){
      if(size == 0){
        vetor[indx] = n;
        this.indx++;
        size++;
      }else{
          if(!contains(n)){
             this.newLength();
             vetor[indx] = n;
             this.indx++;
             size++;
          }
      }
        
    }
    public boolean contains(int n){
        boolean contain = false;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == n)
              contain = true;
        }
        return contain;
    }
    public  void remove (int n){
        if(contains(n)){
          for(int i = 0; i < this.size; i++){
              if(this.vetor[i] !=0){
                  int k = index(n);
                  if(k >= 0 ){
                    for(int j = index(n); j < size; j++){
                        if(this.vetor[j + 1] == 0)
                           this.vetor[j] = 0; 
                        else
                           this.vetor[j] = vetor[j+1];
                    }
                  }
              }
          }
            this.indx--;
            this.size--;
        }
    }
    public void empty(){
        int sizer = size;
        for(int i = 0; i < sizer; i++){
            vetor[i] = 0;
            this.size--;
            this.indx--;
        }
    }
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < size; i++){
            s += Integer.toString(vetor[i]) + " ";
        }
        return s;
    }
    public Conjunto combine(Conjunto add){
        Conjunto two = new  Conjunto();
       
        for(int i = 0; i < this.size; i++){
            two.insert(this.vetor[i]);
        }
        for(int j = 0; j < add.size; j++ ){
            if(!two.contains(add.vetor[j]))
               two.insert(add.vetor[j]);  
        }
        return two;
    }
    public Conjunto subtract(Conjunto dif){
        Conjunto diferente = new Conjunto();
        for(int i = 0; i < this.size; i++){
            if(!dif.contains(this.vetor[i]))
               diferente.insert(this.vetor[i]);
        }
        return diferente;
    }
    public Conjunto intersect(Conjunto inter){
        Conjunto intercecao = new Conjunto();
        for(int i = 0; i < inter.size; i++){
            if(this.contains(inter.vetor[i]))
               intercecao.insert(inter.vetor[i]);
        }
        return intercecao;
    }
    /**
     * Funcao Auxiliar
     * retorna o indice
     * @param n
     * @return j
     */
    private int index(int n){
        int j = -1;
        for(int i = 0; i < this.size; i++){
            if(this.vetor[i] == n)
              j = i;
        }
        return j;
    }
    private void newLength(){
        if(this.size == 100)
         this.length = this.size * 2;
    }

    
}

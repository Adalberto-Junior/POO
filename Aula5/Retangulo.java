package Aula5;

public class Retangulo {
    private double comprimento;
    private double altura;
    public Retangulo(double comprimento, double altura){
        valid(comprimento, altura);
        this.comprimento = comprimento;
        this.altura = altura;
    }
    public void set(double comprimento, double altura){
        valid(comprimento, altura);
        this.comprimento = comprimento;
        this.altura = altura;
    }
    public double getComprimento(){return comprimento;}
    public double getAltura(){return altura;}
    public Retangulo get(){return this;}
    public double area(){return comprimento * altura;}
    public double perimetro(){return 2 * (comprimento + altura);}
    public String toString(){  //duvida
        return "Tipo: Retangulo" + "; " + "comprimento: " + comprimento + "; " + "Altura: " + altura + "; " + "Area: " + area() +  "; " + "Perimetro: " + perimetro();
    }
    public boolean valid(double comprimento, double altura){return comprimento > 0 && altura > 0;}
    public boolean equals(Retangulo b){ // duvida;
        if(this.comprimento == b.comprimento && this.altura == b.altura )
            return true;
        else
            return false;
    }
    
}

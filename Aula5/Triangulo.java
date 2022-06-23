package Aula5;
import java.lang.Math;
public class Triangulo {
        private double lado1;
        private double lado2;
        private double lado3;
    public Triangulo(double lado1, double lado2, double lado3){
        valid(lado1, lado2, lado3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public void set(double lado1, double lado2, double lado3){
        valid(lado1, lado2, lado3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double getLado1(){return lado1;}
    public double getLado2(){return lado2;}
    public double getLado3(){return lado3;}
    public Triangulo get(){return this;}
    public double area(){
        double p; 
        double A;
        p = perimetro()/2;
        A = Math.pow((p*(p-lado1)*(p-lado2)*(p-lado3)), 2);
        return A;
    }
    public double perimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }

    public boolean valid(double lado1, double lado2, double lado3){
        return lado1 > 0 && lado2 > 0 && lado3 > 0 && triangularInequality(lado1, lado2, lado3);
    }
    public boolean triangularInequality(double lado1, double lado2, double lado3){
        return lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2); 
    }
    public String toString(){ //duvida
        return "Tipo: Triangulo" + "; " + "lado1: " + lado1 + "; " +  "lado2: " + lado2 + "; " + "Lado3: " +  lado3 + "; " + "Area: " + area() +  "; " + "Perimetro: " + perimetro();
    }
    public boolean equals(Triangulo b){    // duvida;
        if(this.lado1 == b.lado1 && this.lado2 == b.lado2 && this.lado3 == b.lado3)
            return true;
        else 
            return false;
    }

    
}

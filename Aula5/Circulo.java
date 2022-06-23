package Aula5;

import java.lang.Math;

public class Circulo {
    private double raio;
    private double PI = Math.PI;
    public Circulo(double raio){
        assert valid(raio): "O Raio deve ser positivo";
        this.raio = raio;}
    public void set(double raio){
        assert valid(raio): "O Raio deve ser positivo";
        this.raio = raio;
    }
public double get(){return raio;}
public double area(){return PI * raio;}
public double perimetro(){return 2 * PI * raio;}

public String toString(){  
    return "Tipo: Circulo" + "; " + "Raio: " + raio +"; " + "Diametro: " + (2 * raio) +  "; " + "Area: " + area() +  "; " + "Perimetro: " + perimetro();
}
public boolean equals(Circulo b){  
    if(this.raio == b.raio)
        return true;
    else
        return false;
}
public boolean valid(double raio){return raio > 0;}
}

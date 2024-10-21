package com.mycompany.figurasgeometricas;

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(String nombre, String color, double base, double altura){
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea(){
        double op = (this.base * this.altura)/2;
        return op;
    }

    @Override
    public double obtenerPerimetro(){
        double op = this.base * 3;
        return op;
    }

}

package com.mycompany.figurasgeometricas;

class Rectangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color, double lado1, double lado2){
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double obtenerArea(){
        double op = lado1*lado2;
        return op;
    }
    
    @Override
    public double obtenerPerimetro(){
        double op = (2*lado1) + (2*lado2);
        return op;
    }
}

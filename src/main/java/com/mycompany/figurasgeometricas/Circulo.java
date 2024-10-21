package com.mycompany.figurasgeometricas;

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio = radio;
    }

    @Override
    public double obtenerArea(){
        double op = Math.PI * Math.pow(this.radio,2);
        return op;
    }

    @Override
    public double obtenerPerimetro(){
        double op = 2 * Math.PI * this.radio;
        return op;
    }
}

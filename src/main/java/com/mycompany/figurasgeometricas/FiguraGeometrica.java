package com.mycompany.figurasgeometricas;

public abstract class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    public abstract double obtenerArea();

    public abstract double obtenerPerimetro();

    // GETTERS
    public String getNombre(){
        return this.nombre;        
    };

    public String getColor(){
        return this.color;
    }

    // SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setColor(String color){
        this.color = color;
    }
}

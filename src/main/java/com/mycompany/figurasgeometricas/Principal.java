package com.mycompany.figurasgeometricas;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre,color;
        int tipo;

        System.out.println("Ingrese el nombre de la figura:");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese el color de la figura:");
        color = sc.nextLine();

        System.out.println("Ingrese el tipo de figura:");
        System.out.println("1: Circulo");
        System.out.println("2: Rectangulo");
        System.out.println("3: Triangulo");
        tipo = sc.nextInt();

        FiguraGeometrica fig = null;

        switch (tipo) {
            case 1:
                System.out.println("Ingrese el radio del circulo:");
                int radio;
                radio = sc.nextInt();
                fig = new Circulo(nombre, color, radio);
                
                System.out.println("\n");
                System.out.println("CIRCULO");
                System.out.println("Nombre: " + fig.getNombre());
                System.out.println("Color: " + fig.getColor());
                System.out.println("Perimetro: " + fig.obtenerPerimetro());
                System.out.println("Area: " + fig.obtenerArea());

                break;
            case 2:
                int lado1, lado2;
                System.out.println("Ingrese el valor del lado 1 del rectangulo:");
                lado1 = sc.nextInt();
                
                System.out.println("Ingrese el valor del lado 2 del rectangulo:");
                lado2 = sc.nextInt();
                fig = new Rectangulo(nombre, color, lado1, lado2);

                System.out.println("\n");
                System.out.println("RECTANGULO");
                System.out.println("Nombre: " + fig.getNombre());
                System.out.println("Color: " + fig.getColor());
                System.out.println("Perimetro: " + fig.obtenerPerimetro());
                System.out.println("Area: " + fig.obtenerArea());
                break;

            case 3:
                int base, altura;
                System.out.println("Ingrese el valor de la base del triangulo:");
                base = sc.nextInt();

                System.out.println("Ingrese el valor de la altura del triangulo:");
                altura = sc.nextInt();
                
                fig = new Triangulo(nombre, color, base, altura);

                System.out.println("\n");
                System.out.println("TRIANGULO");
                System.out.println("Nombre: " + fig.getNombre());
                System.out.println("Color: " + fig.getColor());
                System.out.println("Perimetro: " + fig.obtenerPerimetro());
                System.out.println("Area: " + fig.obtenerArea());

                break;
        }

    }
}

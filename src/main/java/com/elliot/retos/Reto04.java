package com.elliot.retos;

import lombok.AllArgsConstructor;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

interface Polygon {
    double calculateArea();
}

@AllArgsConstructor
class Rectangle implements Polygon {

    double width;
    double height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}

@AllArgsConstructor
class Square implements Polygon {

    double side;

    @Override
    public double calculateArea() {
        return side * side;
    }
}

@AllArgsConstructor
class Triangle implements Polygon {

    double base;
    double height;

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}

public class Reto04 {

    public void printPolygonArea(Polygon polygon) {
        System.out.println("Polygon area: " + polygon.calculateArea());
    }
}

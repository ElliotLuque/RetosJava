package com.elliot.retos;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class TestReto04 {

    Reto04 printAreaTests = new Reto04();
    Rectangle rectangle = new Rectangle(10, 5.5);
    Triangle triangle = new Triangle(5, 20);
    Square square = new Square(2.5);

    @Test
    void itShouldGiveRectangleArea() {
        double result = rectangle.calculateArea();

        assertThat(result).isEqualTo(55);
    }

    @Test
    void itShouldNotGiveRectangleArea() {
        double result = rectangle.calculateArea();

        assertThat(result).isNotEqualTo(5.125255);
    }

    @Test
    void itShouldGiveTriangleArea() {
        double result = triangle.calculateArea();

        assertThat(result).isEqualTo(50);
    }

    @Test
    void itShouldNotGiveTriangleArea() {
        double result = triangle.calculateArea();

        assertThat(result).isNotEqualTo(1250);
    }

    @Test
    void itShouldGiveSquareArea() {
        double result = square.calculateArea();

        assertThat(result).isEqualTo(6.25);
    }

    @Test
    void itShouldNotGiveSquareArea() {
        double result = square.calculateArea();

        assertThat(result).isNotEqualTo(7.25);
    }

    @Test
    void itShouldPrintPolygonAreas() {
        Rectangle rectangle = new Rectangle(10.0,5.5);
        Triangle triangle = new Triangle(5,20);
        Square square = new Square(2.3);

        printAreaTests.printPolygonArea(rectangle);
        printAreaTests.printPolygonArea(triangle);
        printAreaTests.printPolygonArea(square);

    }
}

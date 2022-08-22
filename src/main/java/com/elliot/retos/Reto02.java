package com.elliot.retos;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Reto02 {

    public int fibonacci(int num) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < num; i++) {
            second = first + second;
            first = second - first;
        }

        return first;
    }

    public void printFibonacciSequence(int times) {
        for (int i = 0; i <= times; i++) {
            System.out.println(fibonacci(i));
        }
    }
}

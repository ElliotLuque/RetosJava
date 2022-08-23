package com.elliot.retos;

/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */

public class Reto13 {
    public int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        } else {
            return num;
        }
    }
}

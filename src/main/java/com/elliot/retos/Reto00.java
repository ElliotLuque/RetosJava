package com.elliot.retos;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class Reto00 {
    public String calculateFizzBuzz(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }

        else if (num % 3 == 0) {
            return "Fizz";
        }

        if (num % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(num);
    }

    public void printFizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(calculateFizzBuzz(i));
        }
    }
}

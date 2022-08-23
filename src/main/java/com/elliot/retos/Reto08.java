package com.elliot.retos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

public class Reto08 {
    public String convertToBinary(int decimal) {

        StringBuilder binaryNumber = new StringBuilder();
        List<Integer> remainderList = new ArrayList<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            decimal = decimal / 2;

            remainderList.add(remainder);
        }

        Collections.reverse(remainderList);
        remainderList.forEach(binaryNumber::append);

        return binaryNumber.toString();
    }
}

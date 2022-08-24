package com.elliot.retos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

public class Reto08 {
    public long convertToBinary(int decimal) {

        if (decimal == 0) {
            return 0L;
        }

        StringBuilder binaryNumberString = new StringBuilder();
        List<Long> remainderList = new ArrayList<>();

        while (decimal > 0) {
            long remainder = decimal % 2;
            decimal = decimal / 2;

            remainderList.add(remainder);
        }

        Collections.reverse(remainderList);
        remainderList.forEach(binaryNumberString::append);

        return Long.parseLong(binaryNumberString.toString());
    }
}

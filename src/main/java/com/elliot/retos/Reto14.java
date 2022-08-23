package com.elliot.retos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

public class Reto14 {
    public boolean isArmstrong(int num) {
        List<Integer> digits = new ArrayList<>();

        int length = (int) (Math.log10(num) + 1);
        int tempNumber = num;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;

            tempNumber = tempNumber / 10;
            digits.add(digit);
        }

        Collections.reverse(digits);
        List<Integer> powerDigits = digits
                .stream()
                .map(digit -> (int) Math.pow(digit, length))
                .toList();

        return powerDigits
                .stream()
                .reduce(Integer::sum)
                .orElse(0) == num;
    }
}

package com.elliot.retos;

/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */

public class Reto19 {
    public long calculateMilliseconds(int days, int hours, int minutes, int seconds) {
        return (days * 86400000L) + (hours * 3600000L)
                + (minutes * 60000L) + (seconds * 1000L);
    }
}

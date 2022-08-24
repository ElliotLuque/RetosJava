package com.elliot.retos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras
 *        "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo)
 *        o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
 *        será correcto y no variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */

public class Reto17 {
    public String race(String[] movements, String course) {

        if (movements.length != course.length()) {
            throw new IllegalArgumentException("There must be the same number of obstacles and moves...");
        }

        if (!checkRaceInput(course) && !checkMovementsInput(movements)) {
            throw new IllegalArgumentException("Race inputs must be well formed... ( '|' = jump, '_' = run )");
        }

        List<String> obstacles = course
                .chars()
                .mapToObj(Character::toString)
                .toList();

        List<String> raceMoves = Arrays
                .stream(movements)
                .toList();

        List<List<String>> table = new ArrayList<>(List.of(obstacles, raceMoves));
        StringBuilder raceResult = new StringBuilder();

        for (int i = 0; i < table.get(0).size(); i++) {
            String obstacle = table.get(0).get(i);
            String move = table.get(1).get(i);

            String obstacleResult = calculateObstacle(obstacle, move);
            raceResult.append(obstacleResult);
        }

        return raceResult.toString();
    }

    public boolean raceResult(String race) {
        return !race.contains("x") || !race.contains("/");
    }

    private String calculateObstacle(String obstacle, String move) {
        switch (obstacle) {
            case "_" -> { return move.equals("run") ? "_" : "x"; }
            case "|" -> { return move.equals("jump") ? "|" : "/"; }
        }

        return obstacle;
    }

    private boolean checkMovementsInput(String[] movements) {
        return Arrays
                .stream(movements)
                .allMatch(movement -> movement.equals("run") || movement.equals("jump"));
    }

    private boolean checkRaceInput(String race) {
        List<Character> charactersRace = race.chars().mapToObj(c -> (char) c).toList();

        return charactersRace
                .stream()
                .allMatch(character -> character == '_' || character == '|');
    }
}

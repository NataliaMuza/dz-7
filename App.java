package org.example;

import static org.example.Animal.*;

public class App {
    public static void main(String[] args) {

        for (SolarSystem planet : SolarSystem.values()) {
            System.out.println(planet.name() + ":");
            System.out.println("  Порядковий номер від Сонця: " + planet.getNumberFromSun());
            System.out.println("  Віддаленість від Сонця: " + planet.getDistanceFromSun() + " км");
            System.out.println("  Віддаленість від попередньої планети: " + planet.getDistanceFromPrevious() + " км");
            System.out.println("  Радіус: " + planet.getRadius() + " км");
            System.out.println("  Попередня планета: " + (planet.getPreviousPlanet() != null ? planet.getPreviousPlanet().name() : "Немає"));
            System.out.println("  Наступна планета: " + (planet.getNextPlanet() != null ? planet.getNextPlanet().name() : "Немає"));
            System.out.println();
        }
    }
}

package org.example;


public enum SolarSystem {
    MERCURY(0, 10, null),
    VENUS(10,20,MERCURY),
    EARTH(15,30,VENUS),
    MARS(20, 40,EARTH),
    JUPITER(25, 50,MARS),
    SATURN(30, 60,JUPITER),
    URANUS(35, 70,SATURN),
    NEPTUNE(40, 80,URANUS);

    private final int numberFromSun; // Порядковий номер від Сонця - Обчислюється в методі
    private final int distanceFromPrevious;
    private final int distanceFromSun; // Відстань від Сонця - Обчислюється в тернарному виразі
    private final int radius;
    private final SolarSystem previousPlanet;
    private SolarSystem nextPlanet;

    // Конструктор для ініціалізації полів
    private SolarSystem(int distanceFromPrevious, int radius, SolarSystem previousPlanet) {
        this.numberFromSun = ordinal() + 1; // Метод "ordinal()" для отримання порядкового номера від Сонця
        this.distanceFromPrevious = distanceFromPrevious;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        //Використання тернарного оператора, має синтаксис: (condition) ? (value_if_true) : (value_if_false);
        this.distanceFromSun = (previousPlanet == null) ? 5 : previousPlanet.getDistanceFromSun() + distanceFromPrevious;

        // Посилання на наступну планету для попередньої планети через setter
        if (previousPlanet != null) {
            previousPlanet.setNextPlanet(this);
        }
    }
    public int getNumberFromSun() {
        return numberFromSun;
    }

    public int getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }

    private void setNextPlanet(SolarSystem nextPlanet) {
        this.nextPlanet = nextPlanet;
    }

}

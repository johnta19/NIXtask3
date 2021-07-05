package com.Alevel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        WeekEnum[] week = WeekEnum.values();
        for (WeekEnum weekEnum : week) {
            System.out.println(weekEnum + " is " + weekEnum.getDayType());
        }

        Earth earth = new Earth();
        System.out.println("Gravity Acceleration of Earth: " + earth.getGravityAcceleration());

        System.out.println("Gravity Acceleration of Mercury: " + new Mercury().getGravityAcceleration());

        System.out.println("Gravity Acceleration of Venus: " + new Venus().getGravityAcceleration());

        System.out.println("Gravity Acceleration of Uranus: " + new Uranus().getGravityAcceleration());

        System.out.println("Population of Earth: " + earth.getPopulation());
        System.out.println("Satellite of Earth: " + earth.getSatellite());
        System.out.println("Mainlands of Earth: " + Arrays.toString(earth.getMainlands()));
    }
}

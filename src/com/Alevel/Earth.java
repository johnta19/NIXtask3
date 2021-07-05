package com.Alevel;

public class Earth extends Planet{
    final static double gravityAcceleration = 9.81;
    final static String[] mainLands = {"Eurasia", "Africa", "North America",
            "South America", "Australia", "Antarctica"};
    final static String satellite = "Moon";
    final static String population = "~7.9 billions";

    public Earth(){
        super(gravityAcceleration);
    }
    String getSatellite(){
        return satellite;
    }
    String getPopulation(){
        return population;
    }
    String[] getMainlands(){
        return mainLands;
    }

}

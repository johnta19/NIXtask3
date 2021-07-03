package com.Alevel;

public class Earth implements Planet {

    String getSatellite(){
        return "Moon";
    }
    String getPopulation(){
        return "~7.9 billions";
    }
    String[] getMainlands(){
        return new String[]{"Eurasia", "Africa", "North America", "South America", "Australia", "Antarctica"};
    }
    @Override
    public double getGravityAcceleration() {
        return 9.81;
    }
}

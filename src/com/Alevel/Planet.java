package com.Alevel;

public abstract class Planet implements IPlanet {

    private final double gravityAcceleration;

    public Planet(double gravityAcceleration) {
        this.gravityAcceleration = gravityAcceleration;
    }

    @Override
    public double getGravityAcceleration(){
        return gravityAcceleration;
    }
}

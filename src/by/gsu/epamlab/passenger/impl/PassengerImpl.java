package by.gsu.epamlab.passenger.impl;

import by.gsu.epamlab.passenger.Passenger;

public class PassengerImpl implements Passenger {
    private String name;
    private double mass;

    public PassengerImpl() {
        super();
    }

    public PassengerImpl(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public String getInfo() {
        return getClass().getSimpleName() + ";" + name ;
    }
    @Override
    public String toString() {
        return  getInfo() + ";" + mass;
    }


}

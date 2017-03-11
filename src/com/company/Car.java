package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Car {
    private boolean mEngine;
    private int mCylinders;
    private String mName;
    private int mWheels;

    public Car( int cylinders, String name) {
        mEngine = true;
        mCylinders = cylinders;
        mName = name;
        mWheels = 4;
    }

    public boolean isEngine() {
        return mEngine;
    }

    public int getCylinders() {
        return mCylinders;
    }

    public String getName() {
        return mName;
    }

    public int getWheels() {
        return mWheels;
    }
    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

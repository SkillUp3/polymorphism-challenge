package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Honda extends Car {
    public Honda(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }

}

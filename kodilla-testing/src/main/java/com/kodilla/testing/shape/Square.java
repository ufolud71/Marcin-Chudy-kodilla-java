package com.kodilla.testing.shape;

public class Square implements Shape {

    @Override
    public String getShapeName() {
        return "Square";
    }
    @Override
    public String getField() {
        return "a^2";
    }
}

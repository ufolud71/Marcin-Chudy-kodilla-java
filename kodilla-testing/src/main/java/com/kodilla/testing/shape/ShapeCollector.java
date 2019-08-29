package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector  {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);

    }

    public boolean removeFigure(Shape shape){
            boolean result = false;
            if (shapes.contains(shape)){
                shapes.remove(shape);
                result = true;
            }
            return result;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }
    public void showFigures(){
        for (Shape s: shapes ){
            System.out.println(s);
        }

    }
    public int getShapesQuantity(){
        return shapes.size();
    }
}

package com.example.factorydesignpattern;

public class ShapeFactory {
    public Shape getShape(String s1) {
        if (s1 == null) {
            return null;
        }
        if (s1.equalsIgnoreCase("Circle")) {
            return new Circle();
        }else if (s1.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if (s1.equalsIgnoreCase("Square")){
          return new Square();
        }
        return null;
    }
}
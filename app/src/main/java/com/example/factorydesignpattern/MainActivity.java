package com.example.factorydesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("Square");
        shape2.draw();
        Shape shape3=shapeFactory.getShape("Circle");
        shape3.draw();
    }
}

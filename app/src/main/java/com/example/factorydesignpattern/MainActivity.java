package com.example.factorydesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShapeFactory shapeFactory=new ShapeFactory();//creating object of ShapeFactory class.
        Shape shape1=shapeFactory.getShape("Rectangle");////calling getShape() by reference variable(shapeFactory).
        shape1.draw();//creating three references of Shape interface,calling method of interface by interface's own references.
        Shape shape2=shapeFactory.getShape("Square");
        shape2.draw();
        Shape shape3=shapeFactory.getShape("Circle");
        shape3.draw();
    }
}

package day02;

import javafx.scene.shape.Circle;

import java.awt.*;

public class AbstractTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
    }
}

abstract class Shape{
    public Shape() {
    }

    public abstract void area();
}

class circle extends Shape{

    @Override
    public void area() {

    }
}

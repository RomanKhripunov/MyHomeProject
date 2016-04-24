package roman.part13;

import java.util.Arrays;
import java.util.List;

abstract class Shape {

    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle: " + getClass().getSimpleName();
    }
}

class Triangle extends Shape {

    @Override
    public String toString() {
        return "Triangle: " + getClass().getSimpleName();
    }
}

class Square extends Shape {

    @Override
    public String toString() {
        return "Square: " + getClass().getSimpleName();
    }
}

public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Triangle(), new Square());

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

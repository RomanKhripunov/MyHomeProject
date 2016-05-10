package roman.part14;

import java.awt.*;

interface HasColor {

    java.awt.Color getColor();
}

class Colored<T extends HasColor> {

    T item;

    public Colored(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    java.awt.Color getColor() {
        return item.getColor();
    }
}

class Dimension {

    public int x, y, z;
}

// Не работает - сначала Класс, потом интерфейсы
//class ColoredDimension<T extends HasColor & Dimension> {}

class ColoredDimension<T extends Dimension & HasColor> {

    T item;

    public ColoredDimension(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color getColor() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

interface Weight {

    int weight();
}

class Solid<T extends Dimension & HasColor & Weight> {

    T item;

    public Solid(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

    int weight() {
        return item.weight();
    }
}

class Bounded extends Dimension implements HasColor, Weight {

    public Color getColor() {
        return null;
    }

    public int weight() {
        return 0;
    }
}

public class BasicBounds {

    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }
}

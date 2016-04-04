package roman.other.simple;

public class CadSystem extends Shape{
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];
    public CadSystem(int i) {
        super(i);
        circle = new Circle(1);
        triangle = new Triangle(2);
        for (int x = 0; x < lines.length; x++){
            lines[x] = new Line(x, x * x);
        }
        System.out.println("Комбинированный конструктор");
    }
    void dispose(){
        triangle.dispose();
        circle.dispose();
        for (int x = lines.length - 1; x >=0; x--){
            lines[x].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CadSystem cadSystem = new CadSystem(2);
        try {
            // code
        }finally{
            cadSystem.dispose();
        }
    }
}

class Shape{
    public Shape(int i) {
        i++;
        System.out.println("Конструктор Shape()");
    }
    void dispose(){
        System.out.println("Завершение Shape()");
    }
}
class Circle extends Shape{
    public Circle(int i) {
        super(i);
        System.out.println("Рисуем окружность Circle()");
    }
    void dispose(){
        System.out.println("Стираем окружность Circle()");
        super.dispose();
    }
}
class Triangle extends Shape{
    public Triangle(int i) {
        super(i);
        System.out.println("Рисуем триугольник Triangle()");
    }
    void dispose(){
        System.out.println("Стираем триугольник Triangle()");
        super.dispose();
    }
}
class Line extends Shape{
    private int start, end;
    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Рисуем линию Line: " + start + ", " + end);
    }
    void dispose(){
        System.out.println("Стираем линию Line: " + start + ", " + end);
        super.dispose();
    }
}
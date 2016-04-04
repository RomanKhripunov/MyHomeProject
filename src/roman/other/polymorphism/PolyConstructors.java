package roman.other.polymorphism;

public class PolyConstructors {
    public static void main(String[] args) {
//        new RoundGlyph(5);
        new OtherGlyph(8);
    }
}

class Glyph{
    Glyph(){
        System.out.println("Glyph() Перед вызовом draw()");
        draw();
        System.out.println("Glyph() После вызова draw()");
    }
    void draw(){
        System.out.println("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    void draw(){
        System.out.println("RoundGlyph.draw() radius = " + radius);
    }
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph RoundGlyph() radius = " + radius);
    }
}

class OtherGlyph extends RoundGlyph{
    private int size = 2;
    void draw(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "OtherGlyph.draw() size = " + size;
    }
    OtherGlyph(int s){
        super(s);
        size = s;
        System.out.println("OtherGlyph.OtherGlyph() size = " + size);
    }
}
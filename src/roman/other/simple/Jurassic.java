package roman.other.simple;

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.i = 40 ;
        dinosaur.j++;
        dinosaur.f();
    }
}

class SmallBrain{}

final class Dinosaur{
    public int i = 7;
    public int j = 9;
    SmallBrain smallBrain = new SmallBrain();
    public void f(){}
}

//class TryExtends extends Dinosaur{}
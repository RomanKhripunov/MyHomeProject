package roman.other.polymorphism;

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        WheatMill w = new WheatMill();
        g = w.process();
        System.out.println(g);
    }
}

class Grain{
    @Override
    public String toString() {
        return "Grain";
    }
}
class Wheat extends Grain{
    @Override
    public String toString() {
        return "Wheal";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Wheat{
    Wheat process(){
        return new Wheat();
    }
}
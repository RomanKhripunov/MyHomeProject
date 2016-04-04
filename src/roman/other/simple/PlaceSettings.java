package roman.other.simple;

public class PlaceSettings extends Custom{
    private DinnerPlate dinnerPlate;
    private Fork fork;
    private Spoon spoon;
    private Knife knife;
    public PlaceSettings(int i) {
        super(i + 1);
        spoon = new Spoon(i + 5);
        fork = new Fork(i + 3);
        knife = new Knife(i + 4);
        dinnerPlate = new DinnerPlate(i - 3);
        System.out.println("Конструктор PlaceSettings()");
    }

    public static void main(String[] args) {
        PlaceSettings placeSettings = new PlaceSettings(7);
    }
}

class Plate{
    public Plate(int i) {
        System.out.println("Конструктор Plate()");
    }
}
class DinnerPlate extends Plate{
    public DinnerPlate(int i) {
        super(i);
        System.out.println("Конструктор DinnerPlate()");
    }
}

class Utensil{
    public Utensil(int i) {
        System.out.println("Конструктор Utensil()");
    }
}
class Fork extends Utensil{
    public Fork(int i) {
        super(i);
        System.out.println("Конструктор Fork()");
    }
}
class Spoon extends Utensil{
    public Spoon(int i) {
        super(i);
        System.out.println("Конструктор Spoon()");
    }
}
class Knife extends Utensil{
    public Knife(int i) {
        super(i);
        System.out.println("Конструктор Knife()");
    }
}
class Custom{
    public Custom(int i) {
        System.out.println("Конструктор Custom()");
    }
}
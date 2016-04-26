package roman.part13;

class Building {
}

class House extends Building {
}

class SmallHouse extends House {
}

public class ClassCast {

    public static void main(String[] args) {
        Building b = new SmallHouse();
        Class<House> houseClass = House.class;
        House h = houseClass.cast(b);
        h = (House) b;
    }
}

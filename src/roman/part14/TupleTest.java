package roman.part14;

class Amphibian {
}

class Vehicle {
}

public class TupleTest {

    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "Hi", 47, 12.2);
    }

    public static void main(String[] args) {
        TwoTuple tt = g();
//        tt.first = "error";
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}

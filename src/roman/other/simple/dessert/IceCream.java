package roman.other.simple.dessert;

class Sundae{
    private Sundae(){
        System.out.println("Вызов конструктора Sundae()");
    }
    static Sundae makeASundae(){
        return new Sundae();
    }
}
public class IceCream {
    public static void main(String[] args) {
//        Sundae sundae = new Sundae();
        Sundae sundae = Sundae.makeASundae();
    }
}

package roman.other.simple;

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('c');
        bart.doh(1.5f);
        bart.doh(new Milhose());
        Lisa.doh(new Milhose());
    }
}

class Homer{
    char doh(char c){
        System.out.println("doh(char)");
        return c;
    }
    float doh(float f){
        System.out.println("doh(float)");
        return f;
    }
}
class Milhose{}

class Bart extends Homer{
    void doh(Milhose m){
        System.out.println("doh(Milhouse)");
    }
}
class Lisa extends Homer{
    /*@Override*/
    static void doh(Milhose m){
        System.out.println("Lisa.doh()");
    }
}
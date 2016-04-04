package roman.other.simple;

public class IntCounter {
    static int a;
    static int b;
    public static void main(String[] args) {

        Reader reader = new Reader();
        reader.intScan();
        a = count(reader.i);
        b = count(reader.k);
        System.out.println("Теперь первое число = " + a);
        System.out.println("Теперь второе число = " + b);
    }
    public static int count(int x){
        return ++x;
    }
}

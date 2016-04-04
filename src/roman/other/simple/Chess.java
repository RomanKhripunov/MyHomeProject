package roman.other.simple;

public class Chess extends BoardGame{
    public Chess() {
        super(11);
        System.out.println("Chess()");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}

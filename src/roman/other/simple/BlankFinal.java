package roman.other.simple;

class Poppet{
    private int i;
    public Poppet(int i){
        this.i = i;
    }
}

public class BlankFinal{
    private final int i = 1;
    private final int j;
    private final Poppet poppet;
    public BlankFinal(){
        this.j = 1;
        this.poppet = new Poppet(1);
        System.out.println("Конструктор по умолчанию - без аргументов");
    }
    public BlankFinal(int x){
        this.j = x;
        this.poppet = new Poppet(x);
        System.out.println("Конструктор с int аргументом");
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
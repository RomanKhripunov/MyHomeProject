package roman.other.polymorphism;

public class ReferenceCounting {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),};
        for (Composing c : composing) {
            c.dispose();
        }
    }
    
    
}

class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared){
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Counting " + id;
    }
}

class Shared{
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared(){
        System.out.println("Создаем " + this);
    }

    public void addRef(){
        refcount++;
    }
    public void dispose(){
        if (--refcount == 0){
            System.out.println("Disposing " + this);
        }
    }

    public String toString() {
        return "Shared " + id;
    }
}
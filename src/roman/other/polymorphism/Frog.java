package roman.other.polymorphism;

public class Frog extends Amphibian{
    private Characteristic c = new Characteristic("квакает");
    private Description d = new Description("есть жуков");

    Frog(){
        System.out.println("Frog");
    }

    protected void dispose(){
        System.out.println("завершение Frog");
        d.dispose();
        c.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("пока!");
        frog.dispose();
    }
}

class Characteristic{
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("создаем Characteristic " + s);
    }
    protected void dispose(){
        System.out.println("завершаем Characteristic " + s);
    }
}

class Description{
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("создаем Description " + s);
    }
    protected void dispose(){
        System.out.println("завершаем Description " + s);
    }
}

class LivingCapture{
    private Characteristic c = new Characteristic("живое существо");
    private Description d = new Description("обычное живое существо");

    LivingCapture() {
        System.out.println("LivingCapture");
    }
    protected void dispose(){
        System.out.println("dispose() в LivingCapture");
        d.dispose();
        c.dispose();
    }
}

class Animal extends LivingCapture{
    private Characteristic c = new Characteristic("имеет сердце");
    private Description d = new Description("животное, не растение");

    Animal() {
        System.out.println("Animal");
    }

    protected void dispose(){
        System.out.println("dispose() в Animal");
        d.dispose();
        c.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{
    private Characteristic c = new Characteristic("может жить в воде");
    private Description d = new Description("и в воде, и на земле");

    Amphibian(){
        System.out.println("Amphibian");
    }

    protected void dispose(){
        System.out.println("dispose() в Amphibian");
        d.dispose();
        c.dispose();
        super.dispose();
    }
}
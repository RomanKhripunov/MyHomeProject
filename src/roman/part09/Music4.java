package roman.part09;

abstract class Instrument{

    private int i;

    public abstract void play(Note n);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();
}

class Wind extends Instrument {


    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }

    public String what(){
        return "Wind";
    }

    public void adjust(){}
}

class Percussion extends Instrument {

    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String what(){
        return "Percussion";
    }

    public void adjust(){}
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {}
}

class Brass extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }

    @Override
    public String what() {
        return "Brass";
    }
}

class Woodwind extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

public class Music4 {

    static void tune( Instrument i){
        i.play(Note.MIDDLE_C);
        i.play(Note.C_SHARP);
    }

    public static void tuneAll( Instrument[] instruments){
        for ( Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
         Instrument[] instruments = {new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()};
        tuneAll(instruments);
    }
}

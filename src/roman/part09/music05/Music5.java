package roman.part09.music05;

import roman.part09.Note;

interface Instrument{
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument{
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument{
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument{
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind{
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments){
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] instruments = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(instruments);
    }
}



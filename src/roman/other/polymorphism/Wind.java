package roman.other.polymorphism;

enum Note{
    MIDDLE_C, C_SHARP, B_FLAT
}

class Instrument {
    public void play(roman.part09.Note n){

        System.out.println("Music4.play()");
    }
}
public class Wind extends Instrument{
    public void play(roman.part09.Note n){

        System.out.println("Wind.play() " + n);
    }
}
class Brass extends Instrument{
    public void play(roman.part09.Note n){

        System.out.println("Brass.play() " + n);
    }
}
class Stringed extends Instrument{
    public void play(roman.part09.Note n){

        System.out.println("Stringed.play() " + n);
    }
}
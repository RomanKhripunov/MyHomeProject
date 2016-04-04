package roman.other.polymorphism;

public class Music2 {
    public static void tune(Wind w){
        w.play(roman.part09.Note.B_FLAT);
    }
    public static void tune(Brass b){
        b.play(roman.part09.Note.MIDDLE_C);
    }
    public static void tune(Stringed s){
        s.play(roman.part09.Note.C_SHARP);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        Brass brass = new Brass();
        Stringed stringed = new Stringed();
        tune(wind);
        tune(brass);
        tune(stringed);
    }
}

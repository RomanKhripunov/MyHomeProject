package roman.other.polymorphism;

public class Music3 {
    public static void tune(InstrumentNew i) {
        i.play(roman.part09.Note.MIDDLE_C);
        i.what();
        i.adjust();
    }
    public static void tuneAll(InstrumentNew[] e){
        for (InstrumentNew instrument : e) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        InstrumentNew[] orchestra = {
            new WindNew(),
            new PercussionNew(),
            new StringedNew(),
            new BrassNew(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}

class InstrumentNew{
    void play(roman.part09.Note n){
        System.out.println("InstrumentNew.play() " + n);
    }
    String what(){
        return "InstrumentNew";
    }
    void adjust(){
        System.out.println("Adjusting InstrumentNew");
    }
}

class WindNew extends InstrumentNew{
    void play(roman.part09.Note n) {
        System.out.println("WindNew.play() " + n);
    }
    String what(){
        return "WindNew";
    }
    void adjust() {
        System.out.println("Adjusting WindNew");
    }
}
class PercussionNew extends InstrumentNew{
    void play(roman.part09.Note n) {
        System.out.println("PercussionNew.play() " + n);
    }
    String what(){
        return "PercussionNew";
    }
    void adjust() {
        System.out.println("Adjusting PercussionNew");
    }
}
class StringedNew extends InstrumentNew{
    void play(roman.part09.Note n) {
        System.out.println("StringedNew.play() " + n);
    }
    String what(){
        return "StringedNew";
    }
    void adjust() {
        System.out.println("Adjusting StringedNew");
    }
}
class BrassNew extends WindNew{
    void play(roman.part09.Note n){
        System.out.println("BrassNew.play() " + n);
    }
    String what(){
        return "BrassNew";
    }
}
class Woodwind extends WindNew{
    void play(roman.part09.Note n){
        System.out.println("Woodwind.play() " + n);
    }
    String what(){
        return "Woodwind";
    }
}
package roman.part09.interfaces.filters;

public class Waveform {

    public static long counter;
    public final long id = counter++;

    public String toString(){
        return "Waveform " + id;
    }
}

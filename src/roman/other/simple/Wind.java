package roman.other.simple;

public class Wind extends Instrumental{
    public static void main(String[] args) {
        Wind wind = new Wind();
        Instrumental.tune(wind);
    }
}
class Instrumental{
    private void play(){}
    static void tune(Instrumental i){
        i.play();
    }
}
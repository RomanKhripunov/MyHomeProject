package roman.part10.innerclasses;

public class Parcel4 {

    private class PContents implements Contents{
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        String label;

        PDestination(String whereTo){
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Contents contents(){
        return new PContents();
    }

    public Destination destination(String whereTo){
        return new PDestination(whereTo);
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
//        Parcel4.PContents = p.contents();
        Contents c = p.contents();
        Destination d = p.destination("Тасмания");
    }
}

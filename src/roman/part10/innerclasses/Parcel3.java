package roman.part10.innerclasses;

public class Parcel3 {

    public class Contents{
        private int i = 0;

        public int value(){
            return i;
        }
    }

    public class Destination{
        private String label;

        Destination(String whereTo){
            this.label = whereTo;
        }

        String readLabel(){
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Parcel3.Contents pc = p.new Contents();
        Parcel3.Destination pd = p.new Destination("Танзания");
    }
}

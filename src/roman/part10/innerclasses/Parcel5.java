package roman.part10.innerclasses;

public class Parcel5 {

    public Destination dest(String s){

        class PDestination5 implements Destination{

            private String label;

            private PDestination5(String whereTo){
                this.label = whereTo;
            }

            public String readLabel(){
                return label;
            }
        }

        return new PDestination5(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel = new Parcel5();
        Destination destination = parcel.dest("Тасмания");
    }
}

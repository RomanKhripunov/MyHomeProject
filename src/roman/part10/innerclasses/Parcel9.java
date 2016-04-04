package roman.part10.innerclasses;

public class Parcel9 {

    public Destination destination(final String str){
        return new Destination() {
            private String label = str;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel = new Parcel9();
        Destination destination = parcel.destination("Тасмания");

        System.out.println("label is \"" + destination.readLabel() + "\"");
    }
}

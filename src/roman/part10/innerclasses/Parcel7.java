package roman.part10.innerclasses;

public class Parcel7 {

    public Contents contents(){
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel = new Parcel7();
        Contents contents = parcel.contents();
        System.out.println("value = " + contents.value());
    }
}

package roman.part10.innerclasses;

public class Parcel7b {

    class MyContents implements Contents{
        private int i = 47;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents(){
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b parcel = new Parcel7b();
        Contents contents = parcel.contents();
        System.out.println("Value = " + contents.value());
    }
}

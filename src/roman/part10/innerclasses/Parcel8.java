package roman.part10.innerclasses;

public class Parcel8 {

    public Wrapping wrapping(int x){

        return new Wrapping(x){
            public int value(){
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel = new Parcel8();
        Wrapping wrapping = parcel.wrapping(10);

        System.out.println(wrapping.value());
    }
}

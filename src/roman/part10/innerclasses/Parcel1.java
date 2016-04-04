package roman.part10.innerclasses;

public class Parcel1 {

    class Contents{

        private int i = 11;

        public int value(){
            return i;
        }
    }

    class Destination{

        private String label;

        Destination (String dest){
            this.label = dest;
        }

        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

//    Использование внутренних классов имеет много общего
//    с использованием любых других классов в пределах Parcel1
    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Тасмания");
    }
}
package roman.part10.innerclasses;
// Вложенные (статические внутренние) классы

public class Parcel11 {

    private static class PContents implements Contents{

        private int i = 11;

        @Override
        public int value() {
            return 0;
        }
    }

    private static class ParcelDestination implements Destination{

        private String label;

        private ParcelDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return null;
        }

        public static void f(){}
        static int x = 10;

        static class AnotherLevel{

            public static void f(){}
            static int x = 10;
        }
    }

    public static Contents contents(){
        return new PContents();
    }

    public static Destination destination(String str){
        return new ParcelDestination(str);
    }

    public static void main(String[] args) {
        Contents cont = contents();
        Destination dest = destination("Тасмания");
    }
}

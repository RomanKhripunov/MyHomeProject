package roman.part10.innerclasses;

public interface ClassInInterface {

    void howdy();

    class Test implements ClassInInterface{

        @Override
        public void howdy() {
            System.out.println("Привет!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}

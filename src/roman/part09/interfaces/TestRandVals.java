package roman.part09.interfaces;

public class TestRandVals {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            System.out.println(RandVals.RANDOM_INT);
            System.out.println(RandVals.RANDOM_LONG);
            System.out.println(RandVals.RANDOM_FLOAT);
            System.out.println(RandVals.RANDOM_DOUBLE);
            System.out.println();
        }
    }
}

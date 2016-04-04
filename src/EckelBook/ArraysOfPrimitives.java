package EckelBook;

public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++){
            a2[i] = a2[i] + 1;
        }
        for (int i = 0; i < a1.length; i++){
            if (a1.length - 1 == i) {
                System.out.println("a1[" + i + "] = " + a1[i]);
            }
            else {
                System.out.print("a1[" + i + "] = " + a1[i] + "; ");
            }

        }
        for (int i = 0; i < a2.length; i++) {
            if (a2.length - 1 == i) {
                    System.out.println("a2[" + i + "] = " + a2[i]);
            } else {
                    System.out.print("a2[" + i + "] = " + a2[i] + "; ");
            }
        }
    }
}

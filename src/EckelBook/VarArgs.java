package EckelBook;

public class VarArgs {
    public static void main(String[] args) {
        printArrays(new Object[]{
                new Integer(47),
                new Float(3.14),
                new Double(11.11)
        });
        printArrays(new Object[]{
                "один", "два", "три"
        });
        printArrays(new Object[]{
                new A(), new A(), new A()
        });
    }
    static void printArrays(Object[] args){
        for (Object obj : args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

class A {
    int i;
}
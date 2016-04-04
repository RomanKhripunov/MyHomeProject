package EckelBook;

public class NewVarArs {
    public static void main(String[] args) {
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47, 3.14, 11.11);
        printArray("один", "два", "три");
        printArray(new B(), new B(), new B());
        printArray(new Integer[]{1, 2, 3});
        printArray();
    }
    static void printArray(Object... args){
        for (Object object : args){
            if (object.equals(47) || object.equals(11.11) || object.equals((float)3.14) || object.equals(3.14)){
                System.out.println("object = " + object);
            }
            else {
                System.out.print(object + " ");
            }
        }
        System.out.println();
    }
}

class B{
    int i;
}
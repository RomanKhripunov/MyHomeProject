package roman.part13;

public class GenericClassReferences {

    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        intClass = Integer.class;
        genericIntClass = Integer.class;
        intClass = Double.class;
//        genericIntClass = Double.class;
        System.out.println(intClass);
        System.out.println(genericIntClass);
    }
}

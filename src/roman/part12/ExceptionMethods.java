package roman.part12;

public class ExceptionMethods {

    public static void main(String[] args) {
        try {
            throw new Exception("Моё исключение");
        } catch (Exception e) {
            System.out.println("Перехвачено");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e);
            System.out.println("e.printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}

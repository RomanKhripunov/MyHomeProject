package roman.part12;

class FourException extends Exception {
}

public class AlwaysFinally {

    public static void main(String[] args) {
        System.out.println("Входим в первый блок try");

        try {
            System.out.println("Входим во второй блок try");
            try {
                throw new FourException();
            } finally {
                System.out.println("finally во втором блоке try");
            }
        } catch (FourException e) {
            System.out.println("Перехвачено FourException в первом блоке try");
        } finally {
            System.out.println("finally в первом блоке try");
        }
    }
}

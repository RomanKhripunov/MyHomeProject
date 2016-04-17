package roman.part12;

public class ExceptionSilencer {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("Nothing was happened");
//            команда 'return' прерывет обработку исключения
            return;
        }
    }
}

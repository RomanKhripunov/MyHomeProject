package roman.part12;

class OneException extends Exception {
    public OneException(String msg) {
        super(msg);
    }
}

class TwoException extends Exception {
    public TwoException(String msg) {
        super(msg);
    }
}

public class ReThrowNew {

    public static void f() throws OneException {
        System.out.println("создание исключения в f()");
        throw new OneException("из f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Во внутреннем блоке try: printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("из внутреннего блока try");
            }
        } catch (TwoException e) {
            System.out.println("Во внешнем блоке try: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}

package roman.part12;

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

public class FullConstructors {

    public static void f() throws MyException {
        System.out.println("Возбуждаем MyException из f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Возбуждаем MyException из g()");
        throw new MyException("Создано в g()");
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }
    }
}

package roman.part12;

public class ExampleExceptionFromSergey {

    public static void main(String[] args) throws RomaException1  {
        log("main");
        new ExampleExceptionFromSergey().m1();
    }

    private void m1() throws RomaException1  {
        try {
            log("m1");
            m2();
        } catch (RomaException2 e) {
            throw new RomaException1("m1 exception", e);
        }
    }

    private void m2() throws RomaException2  {
        try {
            log("m2");
            m3();
        } catch (RomaException3 e) {
            throw new RomaException2("m2 exception", e);
        }
    }

    private void m3() throws RomaException3 {
        log("m3");
        throw new RomaException3("m3 exception");
    }

    private static void log(String msg) {
        System.out.println(msg);
    }

    private class RomaException1 extends Exception {

        public RomaException1() {}

        public RomaException1(String message) {
            super(message);
        }

        public RomaException1(String message, Throwable cause) {
            super(message, cause);
        }

        public RomaException1(Throwable cause) {
            super(cause);
        }
    }

    private class RomaException2 extends Exception {

        public RomaException2() {}

        public RomaException2(String message) {
            super(message);
        }

        public RomaException2(String message, Throwable cause) {
            super(message, cause);
        }

        public RomaException2(Throwable cause) {
            super(cause);
        }
    }

    private class RomaException3 extends Exception {

        public RomaException3() {
        }

        public RomaException3(String message) {
            super(message);
        }

        public RomaException3(String message, Throwable cause) {
            super(message, cause);
        }

        public RomaException3(Throwable cause) {
            super(cause);
        }
    }
}

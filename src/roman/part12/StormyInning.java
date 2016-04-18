package roman.part12;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {

    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
    }

    public abstract void atBat() throws Foul, Strike;

    public void walk() {
    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {

    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul, BaseballException {
    }

    @Override
    public void atBat() throws PopFoul {
    }

    @Override
    public void rainHard() throws RainedOut {
    }

    @Override
    public void event() {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop Foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained Out");
        } catch (BaseballException e) {
            System.out.println("Обобщенное исключение");
        }

        try {
//            Что произойдет при восходящем преобразовании?
            Inning i = new StormyInning();
            i.atBat();

//            необходимо перехватить исключение
//            их базовой версии метода
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained Out");
        } catch (BaseballException e) {
            System.out.println("Обобщенное исключение");
        }
    }
}

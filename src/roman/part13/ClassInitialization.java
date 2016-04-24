package roman.part13;

import java.util.Random;

class Initable {

    static final int staticFinal1 = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Инициализация Initable");
    }
}

class Initable2 {

    static int staticNonFinal = 147;

    static {
        System.out.println("Инициализация Initable2");
    }
}

class Initable3 {

    static int staticNonFinal = 47;

    static {
        System.out.println("Инициализация Initable3");
    }
}

public class ClassInitialization {

    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("После создания ссылки Initable");

        System.out.println(Initable.staticFinal1);

        System.out.println(Initable.staticFinal2);

        System.out.println(Initable2.staticNonFinal);

        Class initable3 = Class.forName("roman.part13.Initable3");
        System.out.println("После создания ссылки Initable3");

        System.out.println(Initable3.staticNonFinal);
    }
}

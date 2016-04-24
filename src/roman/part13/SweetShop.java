package roman.part13;

class Candy {

    static {
        System.out.println("Загрузка класса Candy");
    }
}

class Gum {

    static {
        System.out.println("Загрузка класса Gum");
    }
}

class Cookie {

    static {
        System.out.println("Загрузка класса Cookie");
    }
}

public class SweetShop {

    public static void main(String[] args) {
        System.out.println("В методе main()");

        new Candy();
        System.out.println("После создания объекта Candy");

        try {
            Class.forName("roman.part13.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Класс Gum не найден");
        }

        System.out.println("После вызова метода Class.forName(\"Gum\")");

        new Cookie();
        System.out.println("После создания объекта Cookie");
    }
}

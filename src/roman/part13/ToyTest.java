package roman.part13;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {

    public Toy() {
    }

    public Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {

    static void printInfo(Class cc) {
        System.out.println("Имя класса: " + cc.getName() + " это интерфейс? [" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноническое имя: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;

        try {
            c = Class.forName("roman.part13.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Не найден класс FancyToy");
            System.exit(1);
        }
        printInfo(c);

        int i = 1;
        System.out.println("----- №" + i + " -----");

        for (Class face : c.getInterfaces()) {
            printInfo(face);
            System.out.println("----- №" + ++i + " -----");
        }

        Class up = c.getSuperclass();
        Object obj = null;

        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Не удалось создать объект");
//            e.printStackTrace();
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Нет доступа");
//            e.printStackTrace();
            System.exit(1);
        }

        printInfo(obj.getClass());
    }
}

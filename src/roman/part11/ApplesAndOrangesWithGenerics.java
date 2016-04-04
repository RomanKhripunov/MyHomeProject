package roman.part11;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        // Ошибка компиляции при попытке добавить в список
        // объекты типа не Apple
        // apples.add(new Orange);

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }

        for (Apple apple : apples) {
            System.out.println(apple.id());
        }
    }
}

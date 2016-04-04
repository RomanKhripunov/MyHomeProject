package roman.part11;
// проверка восходящего преобразования
// при работе со списками

import java.util.ArrayList;

public class GenericsAndUpcasting {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}

class GrannySmith extends Apple{
    @Override
    public String toString() {
        return "GrannySmith";
    }
}

class Gala extends Apple{
    @Override
    public String toString() {
        return "Gala";
    }
}

class Fuji extends Apple{
    @Override
    public String toString() {
        return "Fuji";
    }
}

class Braeburn extends Apple{
    @Override
    public String toString() {
        return "Braeburn";
    }
}
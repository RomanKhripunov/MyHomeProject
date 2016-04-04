package roman.part10.innerclasses;
// При использовании реальных или абстрактных классов
// "множественное наследование реализации" возможно
// только с применением внутренних классов

import java.util.ArrayList;

public class MultiImplementation {

    static void takesD (D d){}
    static void takesE (E e){}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());

        ArrayList<String> list = new ArrayList<>();
        list.add("проверка");
        list.get(0).length();
        System.out.println(list.get(0).length());
    }
}

class D{}
abstract class E{}

class Z extends D{

    E makeE(){
        return new E() {
        };
    }
}
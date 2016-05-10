package roman.part14;

interface FactoryI<T> {
    T create();
}

class Foo2<T> {

    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {

    public Integer create() {
        return new Integer(0);
    }
}

class Widget {

    public static class Factory implements FactoryI<Widget> {
        public Widget create() {
            return new Widget();
        }
    }
}

public class FactoryConstraint {

    public static void main(String[] args) {
        System.out.println(new Foo2<Integer>(new IntegerFactory()));
        System.out.println(new Foo2<Widget>(new Widget.Factory()));
    }
}

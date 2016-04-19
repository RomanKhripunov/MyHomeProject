package roman.part11;

public class ARun {

    public static void main(String[] args) {
        B2Action b2Action = new B2Action();
        B1Action b1Action = new B1Action();
        B3 b3 = new B3();
        System.out.println(b1Action.prepare(b3));
//        System.out.println(b2Action.prepare(b3));

        new B3Action().printK();
        new B4Action().printK();
    }
}

class B3 implements V1 {
    @Override
    public int getValue() {
        return 6;
    }
}


interface V1 {
    int getValue();
}

interface V2 extends V1 {
    int newGetValue();
}

interface IAction<T extends V1> {
    int prepare(T v1);
}

class MainAction<T extends V1> implements IAction<T> {

    @Override
    public int prepare(T v1) {
        return v1.getValue() * 2;
    }
}

class B1Action extends MainAction<V1> {

//    @Override
//    public int prepare(V1 v1) {
//        return v1.getValue() * 3;
//    }
}

class B2Action extends MainAction<V2> {

    @Override
    public int prepare(V2 v2) {
        return v2.newGetValue() * 4;
    }
}

abstract class MainAction2<T extends V1, K> implements IAction<T> {

    private final K k;

    protected MainAction2(K k) {
        super();
        this.k = k;
    }


    @Override
    public int prepare(T v1) {
        return v1.getValue() * 2;
    }

    public void printK() {
        if (k == null) {
            System.out.println("k is null");
        } else {
            System.out.println("k is " + k.getClass().getName());
        }
    }
}

class B3Action extends MainAction2<V1, String> {

    public B3Action() {
        super("str");
    }
}

class B4Action extends MainAction2<V1, Integer> {

    public B4Action() {
        super(123);
    }
}
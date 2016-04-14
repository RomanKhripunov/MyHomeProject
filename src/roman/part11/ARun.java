package roman.part11;

public class ARun {

    public static void main(String[] args) {
        B2Action b2Action = new B2Action();
        B3 b3 = new B3();
        b2Action.prepare(b3);
    }
}

class B3 implements V2 {
    @Override
    public int getValue() {
        return 0;
    }
}


interface V1<T> {
    int getValue();
}

interface V2 extends V1 {

}

interface IAction {
    <T1> int prepare(V1<? extends T1> v1);
}

class MainAction implements IAction {

    @Override
    public <T1> int prepare(V1<? extends T1> v1) {
        return v1.getValue() * 2;
    }
}

class B1Action extends MainAction {

    @Override
    public <T1> int prepare(V1<? extends T1> v1) {
        return v1.getValue() * 3;
    }
}

class B2Action extends MainAction {

    @Override
    public <T1> int prepare(V1<? extends T1> v2) {
        return v2.getValue() * 4;
    }
}

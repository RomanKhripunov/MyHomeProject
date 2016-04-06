package roman.part11;

public class ARun {

    public static void main(String[] args) {

    }
}

interface V1 {
    int getValue();
}

interface V2 extends V1 {

}

interface IAction {
    int prepare(V1 v1);
}

class MainAction implements IAction {

    @Override
    public int prepare(V1 v1) {
        return v1.getValue() * 2;
    }
}

class B1Action extends MainAction {

    @Override
    public int prepare(V1 v1) {
        return v1.getValue() * 3;
    }
}

class B2Action extends MainAction {

    @Override
    public int prepare(V2 v2) {
        return v2.getValue() * 4;
    }
}
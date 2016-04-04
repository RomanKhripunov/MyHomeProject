package roman.other.polymorphism;

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(),
                    new MoreUseful()};
        x[0].f();
        x[1].g();

//        Стадия компиляции, метод не найден в классе UseFul
//!        x[0].u;
        ((MoreUseful)x[1]).u();
        ((MoreUseful)x[0]).u();
    }
}

class Useful{
    public void f(){}
    public void g(){}
}

class MoreUseful extends Useful{
    public void f(){}
    public void g(){}
    public void u(){}
    public void w(){}
    public void v(){}
}
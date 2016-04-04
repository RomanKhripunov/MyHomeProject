package roman.part10.innerclasses;
// Обращение к объекту внешнего класса

public class DotThis {

    public void f(){
        System.out.println("DotThis.f()");
    }

    public class Inner{

        public DotThis outer(){
            return DotThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();

        DotThis.Inner dti1 = dt.inner();
        dti1.outer().f();

        DotThis.Inner dti2 = dt.new Inner();
        dti2.outer().f();
    }
}

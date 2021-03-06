package roman.part10.innerclasses;

public class MultiNestingAccess {

    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}

class MNA{

    private void f(){
        System.out.println("MNA.f()");
    }

    class A{

        private void g(){
            System.out.println("MNA.A.g()");
        }

        public class B{

            void h(){
                f();
                g();
            }
        }
    }
}
package roman.part09.interfaces;

public class NestingInterface {

    public class BInt implements A.B {
        public void f(){};
    }

    class CInt implements A.C{
        public void f(){};
    }

//    Приватный интерфейс можно реализовывать только в в том классе,
//    где этот интерфейс был определен
//    public class DImp implements A.D{
//        public void f(){};
//    }

    class EImp implements E{
        public void g(){};
    }

    class EGImp implements E.G{
        public void f(){};
    }

    class EImp2 implements E{
        public void g(){};

        class EG implements E.G{
            public void f(){};
        }
    }

    public static void main(String[] args) {
        A a = new A();
//        Нет доступа к A.D
//        A.D ad = a.getD();
//        ...
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}

class A {

    interface B{
        void f();
    }

    public class BInt implements B{
        public void f(){};
    }

    private class BInt2 implements B{
        public void f(){};
    }

    public interface C{
        void f();
    }

    class CInt implements C{
        public void f(){};
    }

    private class CInt2 implements C{
        public void f(){};
    }

    private interface D{
        void f();
    }

    private class DInt implements D{
        public void f(){};
    }

    public class DInt2 implements D{
        public void f(){};
    }

    public D getD(){
        return new DInt2();
    }

    private D dRef;

    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }
}

interface E{

    interface G{
        void f();
    }

    public interface H{
        void f();
    }

    void g();

//    Не может быть private внутри интерфейса
//!    private interface I{}
}
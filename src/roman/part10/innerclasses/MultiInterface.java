package roman.part10.innerclasses;
// Два способа реализации нескольких интерфейсов.

public class MultiInterface {

    static void takesA(A a){}
    static void takesB(B b){}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}

interface A{}
interface B{}

class X implements A, B{
}

class Y implements A{

    B makeB(){
        return new B() {
        };
    }
}
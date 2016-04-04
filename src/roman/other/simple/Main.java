package roman.other.simple;

class A {
    static Main glavny = new Main();
    void foo(){
        System.out.println("A: вызван метод foo()");
    }
    void bar(){
        System.out.println("A: вызван метод bar()");
    }
}
class B{
    A a = new A();
    A d = new A();
    A s = new A();
    A w = new A();
    void foo(){
        a.foo();
        s.foo();
        d.foo();
    }
    void bar(){
        a.bar();
        w.bar();
    }
}

public class Main{
    public static void main(String[] args){
        B b = new B();
        b.foo();
        b.bar();
    }
}
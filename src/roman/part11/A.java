package roman.part11;

public class A {

    public void getValue(Class<? extends I> i){}
}

class B extends A {

    @Override
    public void getValue(Class<? extends I> i) {
    }
}

interface I{}

interface IB extends I {}


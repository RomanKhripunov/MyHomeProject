package roman.other.simple;

class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
}

class OverridingFinals extends WithFinals{
    private final void f(){
        System.out.println("OverridingFinals.f()");
    }
    private void g(){
        System.out.println("OverridingFinals.g()");
    }
}

class OverridingFinals2 extends OverridingFinals{
    public final void f(){
        System.out.println("OverridingFinals2.f()");
    }
    public void g(){
        System.out.println("OverridingFinal2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingFinals2 overridingFinals2 = new OverridingFinals2();
        overridingFinals2.f();
        overridingFinals2.g();

        OverridingFinals overridingFinals = overridingFinals2;
        System.out.println(overridingFinals);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

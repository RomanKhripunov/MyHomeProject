package roman.part10.innerclasses;

public class WithInner {

    class Inner{
        public void test(){
            System.out.println("Inner Class");
        }
    }

    public class InheritInner extends WithInner.Inner{

        InheritInner(WithInner wi){
            wi.super();
        }

        public void test(){
            super.test();
            System.out.println("InheritInner Class");
        }
    }

    public static void main(String[] args) {
        WithInner w = new WithInner();
        InheritInner ii = w.new InheritInner(w);
        ii.test();
    }
}

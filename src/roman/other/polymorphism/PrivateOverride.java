package roman.other.polymorphism;

public class PrivateOverride {

    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        /*Если указан тип объекта супер класс,
        то и метод будет вызываться для
        супер класса. Если же в данном примере
        изменить тип на Derived, то будет вызываться
        метод унаследованного класса*/
        PrivateOverride po = new Derived();
        po.f();
    }
}
class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public f()");
    }
}

package roman.part10.innerclasses;

abstract class Base{
    public Base(int i){
        System.out.println("Конструктор Base, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {

    public static Base getBase(int i){
        return new Base(i) {{
                System.out.println("Инициализация экземпляра.");
            }
            @Override
            public void f() {
                System.out.println("Безымянный.f()");
            }
        };
    }

    public static void main(String[] args){
        Base base = getBase(47);
        base.f();
    }
}

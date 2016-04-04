package roman.part09.interfaces;

public class Adventure {

    public static void f(CanFight canFight){
        canFight.fight();
    }

    public static void l(CanFly canFly){
        canFly.fly();
    }

    public static void s(CanSwim canSwim){
        canSwim.swim();
    }

    public static void a(ActionCharacter actionCharacter){
        actionCharacter.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        f(hero);
        l(hero);
        s(hero);
        a(hero);
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim{

    public void fly(){
        System.out.println("fly()");
    }

    public void fight(){
        System.out.println("fight()");
    }

    public void swim(){
        System.out.println("swim()");
    }
}

interface CanFight{

    void fight();
}

interface CanFly{

    void fly();
}

interface CanSwim{

    void swim();
}

class ActionCharacter{

    public void fight(){
        System.out.println("ActionCharacter.fight()");
    }
}
package roman.other.simple;

import static roman.other.simple.Print.print;

public class Detergent extends Cleanser{
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void fom(){
        append(" fom()");
    }

/*    @Override
    public String toString() {
        return ;
    }*/

    public static void main(String[] ar) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.fom();
        print(detergent);
        print("Проверяем суперкласс");
        Cleanser.main(ar);
    }
}

class Cleanser{
    private String s = "Cleanser";
    public void append(String a){
        s += a;
    }
    public void dilute(){
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub(){
        append(" scrub()");
    }
    public String toString(){
        return s;
    }
    public static void main(String[] arg) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}
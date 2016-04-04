package roman.other.simple;

public class Orc extends Villain {
    private int numberOfOrc;
    public Orc(String name, int number){
        super(name);
        try {
            this.numberOfOrc = number;
        } finally {
            System.out.println("Конструктор класса Orc");
        }
    }
    public void changeOrc(String name, int number){
        try {
            set(name);
            this.numberOfOrc = number;
        } finally {
            System.out.println("Вызов медота changeOrc для изменения значений параметров класса");
        }
    }

    @Override
    public String toString() {
        return "Orc " + numberOfOrc + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Серега Питерский", 18);
        System.out.println(orc);
        orc.changeOrc("Петро", 92);
        System.out.println(orc);
    }
}

class Villain {
    private String name;
    public Villain(String name){
//        super(name);
        try {
            this.name = name;
        }finally {
            System.out.println("Констурктор класса Villain, name = " + name);
        }
    }
    protected void set(String nm){
        try {
            name = nm;
        }
        finally {
            System.out.println("Изменение значения приватного поля name");
        }
    }
    public String toString() {
        return "Я объект Villain и мое имя " + name;
    }
}

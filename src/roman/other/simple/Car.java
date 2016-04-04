package roman.other.simple;

public class Car {
    Door
            leftDoor = new Door(),
            rightDoor = new Door();
    Engine engine = new Engine();
    Wheel[] wheels = new Wheel[4];
    Car(){
        for (int i = 0; i < wheels.length; i++){
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.wheels[0].inflate(72);
        car.leftDoor.open();
        car.leftDoor.close();
        car.engine.start();
        car.leftDoor.window.rolldown();
    }
}

class Engine{
    public void start(){
        System.out.println("Заводим автомобиль");
    }
    public void rev(){}
    public void stop(){}
}
class Wheel{
    public void inflate(int psi){
        System.out.println("Накачиваем колесо " + psi);
    }
}
class Window{
    public void rollup(){
        System.out.println("Поднимаем окно");
    }
    public void rolldown(){
        System.out.println("Опускаем окно");
    }
}
class Door{
    public Window window = new Window();
    public void open(){
        System.out.println("Открываем дверь");
    }
    public void close(){
        System.out.println("Закрываем дверь");
    }
}
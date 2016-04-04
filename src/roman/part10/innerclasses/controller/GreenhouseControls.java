package roman.part10.innerclasses.controller;

public class GreenhouseControls extends Controller{

    private boolean light = false;

    // Внутренний класс включения освешения
    public class LightOn extends Event{

        public LightOn(long delayTime){
            super(delayTime);
        }

        public void action(){
            // здесь размещается код включения физического освещения
            light = true;
        }

        @Override
        public String toString() {
            return "Свет включен";
        }
    }

    // Внутренний класс выключения освешения
    public class LightOff extends Event{

        public LightOff(long delayTime){
            super(delayTime);
        }

        public void action(){
            // здесь размещается код выключения физического освещения
            light = false;
        }

        @Override
        public String toString() {
            return "Свет выключен";
        }
    }

    private boolean water = false;

    // Внутренний класс включения полива водой
    public class WaterOn extends Event{

        public WaterOn(long delayTime){
            super(delayTime);
        }

        public void action(){
            // код включения полива
            water = true;
        }

        @Override
        public String toString() {
            return "Полив включен";
        }
    }

    // Внутренний класс выключения полива
    public class WaterOff extends Event{

        public WaterOff (long delayTime){
            super(delayTime);
        }

        public void action(){
            // код выключения полива
            water = false;
        }

        @Override
        public String toString() {
            return "Полив выключен";
        }
    }

    private String thermostat = "День";

    public class ThermostatNight extends Event{

        public ThermostatNight (long delayTime){
            super(delayTime);
        }

        public void action(){
            thermostat = "Ночь";
        }

        @Override
        public String toString() {
            return "Термостат использует ночной режим";
        }
    }

    public class ThermostatDay extends Event{

        public ThermostatDay (long delayTime){
            super(delayTime);
        }

        public void action(){
            thermostat = "День";
        }

        @Override
        public String toString() {
            return "Термостат использует дневной режим";
        }
    }

    public class Bell extends Event{

        public Bell (long delayTime){
            super(delayTime);
        }

        public void action(){
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Бам!";
        }
    }

    public class Restart extends Event{

        private Event[] eventList;

        public Restart (long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        public void action(){
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Рестарт системы";
        }
    }

    public static class Terminate extends Event{

        public Terminate(long delayTime){
            super(delayTime);
        }

        public void action(){
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Отключение";
        }
    }
}

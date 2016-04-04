package roman.part10.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c){
        eventList.add(c);
    }

    public void run(){
        while (eventList.size() > 0){
            for (Event e : new ArrayList<>(eventList)){
                System.out.println(e);
                e.action();
                eventList.remove(e);
            }
        }
    }
}

package roman.part09.interfaces.classprocessor;

import java.util.Arrays;

//public interface Processor{
//
//    String name();
//    Object process(Object input);
//}

class Processor {

    String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }
}

class UpperCase extends Processor {

    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class DownCase extends Processor {

    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {

    String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply{

    public static void process(Processor p, Object s){
        System.out.println("Используем Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpperCase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
    }
}


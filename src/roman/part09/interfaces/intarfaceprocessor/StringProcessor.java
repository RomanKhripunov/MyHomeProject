package roman.part09.interfaces.intarfaceprocessor;

import java.util.Arrays;

public abstract class StringProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s = "If she weighs the same as duck, she's made of wood";

    public static void main (String[] args){
        Apply.process(new UpperCase(), s);
        Apply.process(new DownCase(), s);
        Apply.process(new Splitter(), s);
    }
}

class UpperCase extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class DownCase extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor{

    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
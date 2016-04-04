package roman.other.simple;

import java.io.*;

public class Print {
//    Печать с переводом строки
    public static void print(Object obj){
        System.out.println(obj);
    }
//    Перевод строки
    public static void print(){
        System.out.println();
    }
//    Без перевода строки
    public static void printnb(Object obj){
        System.out.print(obj);
    }
//    Печать строки с форматированием
    public static PrintStream printf(String format, Object... args){
        return System.out.printf(format, args);
    }
}

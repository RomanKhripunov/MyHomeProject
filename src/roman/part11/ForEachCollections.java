package roman.part11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {

    public static void main(String[] args) {
        Collection<String> stringCollection = new LinkedList<>();
        Collections.addAll(stringCollection, "Take the long way home".split(" "));
        for (String s : stringCollection) {
            System.out.print("'" + s + "' ");
        }
    }
}

package roman.part11;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }

        for (Integer integer : collection) {
            System.out.print(integer + " ");
        }
    }
}

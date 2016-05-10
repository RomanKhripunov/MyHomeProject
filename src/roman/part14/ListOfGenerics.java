package roman.part14;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics<T> {

    List<T> array = new ArrayList<>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
}

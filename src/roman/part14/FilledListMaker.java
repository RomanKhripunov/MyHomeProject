package roman.part14;

import java.util.ArrayList;
import java.util.List;

public class FilledListMaker<T> {

    List<T> create(T t, int n) {
        List<T> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            resultList.add(t);
        }
        return resultList;
    }

    public static void main(String[] args) {
        FilledListMaker<String> stringMaker = new FilledListMaker<>();
        List<String> stringList = stringMaker.create("Hello", 4);
        System.out.println(stringList);
    }
}

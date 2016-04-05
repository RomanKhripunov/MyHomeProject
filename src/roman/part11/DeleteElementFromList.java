package roman.part11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeleteElementFromList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add("elemet " + i);
        }

        map(list.stream().collect(Collectors.toMap(e -> e, v -> v)));

        list = removeElement(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> removeElement(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                // Do nothing
            } else if (i % 2 == 0) {
                list.remove(i);
            }
        }

        return list;
    }

    public static void map(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map.remove(entry.getKey());
        }
    }
}
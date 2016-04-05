package roman.part11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistic {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random(47);

        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(20);
            Integer freq = map.get(number);
            map.put(number, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(map);
    }
}

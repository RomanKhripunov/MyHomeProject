package roman.part11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {

    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intSet = new HashSet<Integer>();

        for (int i = 0; i < 10000; i++) {
            intSet.add(random.nextInt(30));
        }

        System.out.println(intSet);
    }
}

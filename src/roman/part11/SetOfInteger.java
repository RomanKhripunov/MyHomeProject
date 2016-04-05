package roman.part11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {

    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> integerHashSet = new HashSet<Integer>();

        for (int i = 0; i < 10000; i++) {
            integerHashSet.add(random.nextInt(30));
        }

        Set<Integer> integerTreeSet = new TreeSet<Integer>();

        for (int i = 0; i < 10000; i++) {
            integerTreeSet.add(random.nextInt(30));
        }

        System.out.println(integerHashSet);
        System.out.println(integerTreeSet);
    }
}

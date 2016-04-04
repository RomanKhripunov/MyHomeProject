package roman.other.hripunov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class StringToTheStart {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

/*        for (int i = 0; i < 5; i++) {
            list.add("значение №" + i);
        }

        for (int i = 0; i < 13; i++) {

            String s = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, s);

        }

        for (String s : list) {
            System.out.println(s);
        }*/

        checkCollection();
    }
    public static void checkCollection(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);
        result.addAll(list2);

        for (Integer x : result) {
            System.out.println(x);
        }
    }
}

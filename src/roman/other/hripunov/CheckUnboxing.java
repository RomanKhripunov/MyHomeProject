package roman.other.hripunov;

import java.util.ArrayList;
import java.util.List;

public class CheckUnboxing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-12);
        int i = absoluteValue(list.get(0));

        System.out.println(i);
    }
    public static int absoluteValue(int i){
        return (i < 0)? -i : i;
    }
}

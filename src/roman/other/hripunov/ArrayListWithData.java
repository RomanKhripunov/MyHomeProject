package roman.other.hripunov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListWithData {

    /*public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("первый", "второй", "третий"));

        for (String s : list) {
            System.out.println(s);
        }
    }*/

    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //напишите тут ваш код
        return null;
    }
}

package roman.other.hripunov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FixArrayList {

    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("поза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static List<String> fix(final List<String> list)
    {
        List<String> fixedList = new ArrayList<String>();

        for (String elementOfList : list){
            if (elementOfList.contains("р") && elementOfList.contains("л")){
                fixedList.add(elementOfList);
            } else if (elementOfList.contains("л")){
                fixedList.add(elementOfList);
                fixedList.add(elementOfList);
            } else if (elementOfList.contains("р")){
                // Nothing
            } else {
                fixedList.add(elementOfList);
            }
        }


        return fixedList;
    }
}

package roman.other.hripunov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxWordSelector {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(s);
        }

        int max = 0;
        ArrayList<String> maxList = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++){
            if (i == 0){
                max = list.get(i).length();
                maxList.add(list.get(i));
            }
            else if (list.get(i).length() > max){
                max = list.get(i).length();
                maxList.clear();
                maxList.add(list.get(i));
            }
            else if (list.get(i).length() == max){
                maxList.add(list.get(i));
            }
        }

        for (String str : maxList){
            System.out.println(str);
        }
    }
}

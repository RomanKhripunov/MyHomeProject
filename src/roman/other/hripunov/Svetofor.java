package roman.other.hripunov;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Svetofor {
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        float x = Float.parseFloat(s);

        if((x % 5) >= 0 && (x % 5) < 3){
            System.out.println("зеленый");
        } else if((x % 5) >= 3 && (x % 5) < 4){
            System.out.println("желтый");
        } else{
            System.out.println("красный");
        }
    }
}

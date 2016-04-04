package roman.other.hripunov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareEquals {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean isExit = false;
        while (!isExit){
            String s = buffer.readLine();
            System.out.println(s);
            isExit = s.equalsIgnoreCase("exit");
        }
    }
}

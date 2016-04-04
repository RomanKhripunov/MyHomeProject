package epam.firstpart;

import java.util.Scanner;

public class MinMaxString {

    public static void main(String[] args) {
        int n = 10;
        Scanner scanner = new Scanner(System.in);
        String  max = "", min = "", str;

        for (int i = 0; i < n; i++) {
            str = scanner.nextLine();
            if (i == 0){
                min = str;
            }
            if (str.length() > max.length()){
                max = str;
            } else if (str.length() < min.length()){
                min = str;
            }
        }
        System.out.println("max = " + max + ", length = " + max.length());
        System.out.println("min = " + min + ", length = " + min.length());
    }
}

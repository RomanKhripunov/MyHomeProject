package epam.firstpart;

import java.util.Scanner;

public class Decision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0;
        double temp, z = 0;


        System.out.println("Введите число x:");
        while ( ! scanner.hasNextDouble()){
            System.out.println("Введите число x:");
            scanner.next();
        }
        x = scanner.nextDouble();

        System.out.println("Введите число y:");
        while ( ! scanner.hasNextDouble()){
            System.out.println("Введите число y:");
            scanner.next();
        }
        y = scanner.nextDouble();

        temp = Math.cos(x) - x / 3;

        if (temp != 0){
            z = x * Math.log(x) + y / temp;
        } else {
            System.out.println("Знаменатель = 0");
            z = Double.NaN;
        }
        System.out.println("z = " + z);
    }
}

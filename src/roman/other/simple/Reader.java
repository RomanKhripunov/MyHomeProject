package roman.other.simple;

import java.util.Scanner;

public class Reader {
    int i,k;
    public void intScan(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        i = scanner.nextInt();
        System.out.println();
        System.out.print("Введите второе число: ");
        k = scanner.nextInt();
        System.out.println();
    }
    /*
    public void printer(){

        System.out.println("Введите первое число:");
        intScan();
        intScan();
    }*/
}

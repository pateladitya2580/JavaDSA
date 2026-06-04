package JavaLanguage.Basic;

import java.util.Scanner;

public class Typecasting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        double y = (double) x;

        System.out.println(y / 2);

        sc.close();
    }
}
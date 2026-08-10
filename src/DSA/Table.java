package DSA;

import java.util.Scanner;

public class Table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int x = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(x * i);
        }
    }
}

package JavaLanguage.Loops;

import java.util.Scanner;

public class sumOfDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int count = 0;
        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            x /= 10;
            count++;
        }
        System.out.println("The sum is " + sum);
    }
}

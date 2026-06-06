package JavaLanguage.Loops;

import java.util.Scanner;

public class countAno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int x = sc.nextInt();
        int count = 0;
        while(x != 0){
            x = x/10;
            count++;
        }
        System.out.println("no of digits is "+count);
    }
}

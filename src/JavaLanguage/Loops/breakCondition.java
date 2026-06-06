package JavaLanguage.Loops;

import java.util.Scanner;

public class breakCondition {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int x = sc.nextInt();
        for (int i = 2; i < x  ; i++) {
            if(x%i==0) {
                System.out.println("composite no.");
                break;
            }
        }
    }
}

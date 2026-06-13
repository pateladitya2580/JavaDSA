package JavaLanguage.patternPrinting.specialPatterrn;

import java.util.Scanner;

public class printStarCross {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i%3==0 || j%3==0)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

package JavaLanguage.patternPrinting.compositePattern;

import java.util.Scanner;

public class numberBridge {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = 1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1;i<=n-1;i++){
            int a = 1;
            for(int j = 1;j<=n-i;j++){
                System.out.print(a+" ");
                a++;
            }
            for(int j = 1 ;j<=2*i-1;j++){
                System.out.print(" "+" ");
                a++;
            }
            for(int j =1;j<=n-i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}

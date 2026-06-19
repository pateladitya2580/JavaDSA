package JavaLanguage.patternPrinting.compositePattern;

import java.util.Scanner;

public class starDiamond {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int nsp = n-1;
        int str = 1;
        for (int i = 1; i<=n;i++){
            for(int j =1 ; j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j = 1 ;j<=str;j++){
                System.out.print("*"+" ");
            }
            nsp--;
            str+=2;
            System.out.println();
        }
        int ns = 1;
        int st =str-4;
        for(int i = 1; i<=n-1;i++)
        {
            for(int j = 1 ;j<=ns;j++){
                System.out.print(" "+" ");
            }
            for(int j = 1 ; j<=st;j++){
                System.out.print("*"+" ");
            }
            ns++;
            st-=2;
            System.out.println();
        }
    }
}

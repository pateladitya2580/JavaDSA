package JavaLanguage.patternPrinting.specialPatterrn;

import java.util.Scanner;

public class starTriangleFlipped {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j = 1;j<=n;j++){
//                if(i+j <= n){
//                    System.out.print(" "+" ");
//                }
//                else if (i+j >n || j== n+1-i){  Method 1 by condition
//                    System.out.print("*"+" ");
//                }
//            }
//            System.out.println();
//        }
        for(int i = 1; i<=n;i++){
            for(int j = 1 ; j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" "); // Method 2 by composition
            }
            System.out.println();
        }
    }
}

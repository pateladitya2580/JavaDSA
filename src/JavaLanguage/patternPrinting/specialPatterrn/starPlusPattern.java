package JavaLanguage.patternPrinting.specialPatterrn;

import java.util.Scanner;

public class starPlusPattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no . ");
        int x = sc.nextInt();
        int mid = x/2 + 1;
        for(int i = 1; i<=x;i++){
            for(int j = 1 ;j<=x;j++){
                if(mid ==j || mid == i){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}

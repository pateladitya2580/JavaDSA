package JavaLanguage.patternPrinting.square;

import java.util.Scanner;

public class aphabetSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++){
            for(int j = 1 ;j<=n ; j++){
                char a = (char) ( j+64);
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}

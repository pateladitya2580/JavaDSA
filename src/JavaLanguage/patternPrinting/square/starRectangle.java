package JavaLanguage.patternPrinting.square;

import java.util.Scanner;

public class starRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and coloum");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 1 ; i<=r;i++){
            for(int j = 1; j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

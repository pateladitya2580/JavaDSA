package JavaLanguage.conditionals;

import java.util.Scanner;

public class GreatestOf3no {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c)
        {
            System.out.println("The greater no. is "+a);
        } else if (b > a && b >c) {
            System.out.println("The greater no. is "+b);
        }
        else{
            System.out.println("The greater no. is "+c);
        }
    }

}

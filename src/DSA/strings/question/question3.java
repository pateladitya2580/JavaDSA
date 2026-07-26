package DSA.strings.question;

import java.util.Scanner;

//Return the total no. of digits in a number without using any loop.
public class question3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int x = sc.nextInt();
//      String s = x +"";
        String s = Integer.toString(x);
        System.out.println("Total no of digits is "+s.length());
    }
}

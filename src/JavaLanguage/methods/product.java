package JavaLanguage.methods;

import java.util.Scanner;

public class product {
    static int product(int x ,int y){
        int res = x*y;
        return res;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int x = sc.nextInt();
        System.out.println("Enter the second no.");
        int y = sc.nextInt();
        int pro = product(x,y);
        System.out.println("Ans is "+pro);
    }
}

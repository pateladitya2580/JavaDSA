package JavaLanguage.methods;

import java.util.Scanner;

public class printTable {
    static void table(int x){
        for(int i = 1; i<=10;i++)
        {
            System.out.println(x * i);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to get the table");
        int y = sc.nextInt();
        table(y);
    }
}

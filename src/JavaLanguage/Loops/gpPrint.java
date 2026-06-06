package JavaLanguage.Loops;

import java.util.Scanner;

public class gpPrint {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1,y =2;
        for(int i = 1;i<=n;i++)
        {
            System.out.println(x);
            x *= y;
        }
    }
}

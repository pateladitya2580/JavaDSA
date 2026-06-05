package JavaLanguage.conditionals;

import java.util.Scanner;

public class nextedIfElse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y){
            if(x>z) System.out.println("grater no . is "+x);
            else System.out.println("grater no. is "+z);
        }
        else {
            if(y>z) System.out.println("greater no. is "+y);
            else System.out.println("greater no. is "+z);
        }
    }
}

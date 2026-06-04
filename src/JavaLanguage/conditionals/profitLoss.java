package JavaLanguage.conditionals;

import java.util.Scanner;

public class profitLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp;
        int sp;
        System.out.print("Enter the cp ");
        cp = sc.nextInt();
        System.out.print("Enter the sp ");
        sp = sc.nextInt();
        if(sp>cp)
        {
            System.out.println("Profit is "+(sp-cp));
        } else if (cp>sp) {
            System.out.println("Loss is "+(cp-sp));
        }
        else{
            System.out.println("No profit No loss");
        }
    }
}

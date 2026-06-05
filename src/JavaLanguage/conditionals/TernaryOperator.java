package JavaLanguage.conditionals;

import java.util.Scanner;

public class TernaryOperator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //condition ? if true : if false
        System.out.println((x%2==0) ? "Even" : "Odd");
    }
}

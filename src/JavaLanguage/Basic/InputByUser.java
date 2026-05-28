package JavaLanguage.Basic;
import java.util.Scanner;
public class InputByUser {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.");
        int n = sc.nextInt();
        System.out.println("The square is "+n*n);
    }
}

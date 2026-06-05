package JavaLanguage.conditionals;

import java.util.Scanner;

public class evenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int x = sc.nextInt();
        if(x % 2 ==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
//relational operator
// == equal to
// != not equal to
// > greater than
// < less than
// >= greater than equal to
// <= less than equal to
// && end me dono condition true honi chaiye
// || or me koi ek condition true honi chaiye
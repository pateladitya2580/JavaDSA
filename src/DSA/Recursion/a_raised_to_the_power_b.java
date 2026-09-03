package DSA.Recursion;
import java.util.Scanner;
//Make a function which calculates 'a' raised to the power 'b' using
//recursion
public class a_raised_to_the_power_b {
    //TC = O(b)
    public static int pow(int a,int b){
        if(b == 0){
            return 1;
        }
        return a * pow(a,b-1);
    }
    //improve code with TC = O log(b)
    public static int pow2(int a,int b){
        if(b == 0) return 1;
        int ans = pow2(a,b/2);
        if(b%2 == 0 ) return ans * ans;
        else return ans * ans * a;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val of a ");
        int a = sc.nextInt();
        System.out.println("Enter the val of b ");
        int b = sc.nextInt();
//        int ans = pow(a,b);
//        System.out.println("Ans is "+ans );

        int ans2 = pow2(a,b);
        System.out.println("Ans is "+ans2);
    }
}

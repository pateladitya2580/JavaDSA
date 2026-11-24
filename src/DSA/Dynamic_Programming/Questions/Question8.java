package DSA.Dynamic_Programming.Questions;
//Friends Pairing Problem by Tabulation Method
/*
you are given a number 'n' .Denoting that there are 'n' friends
find out the no. of way in which a person can either pair up or
stay single.
 */
import java.util.Scanner;

public class Question8 {
    public static int pair (int n ){
        int[]dp = new int[n+1];
        dp[1] = 1;
        if(n>1)dp[2] = 2;
        for(int i =3 ;i<=n ;i++){
          dp[i] = dp[i-1]+ (i-1)*dp[i-2];
        }
        return dp[n];
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pair(n));
    }
}

package DSA.Recursion;
import java.util.Scanner;
public class generate_parenthesis {
    public static void printParenthesis(int open,int close,int n,String ans){
        if(ans.length() == 2*n){
            System.out.println(ans);
            return;
        }
        if(open<n)printParenthesis(open+1,close,n,ans+"(");
        if(close<open)printParenthesis(open,close+1,n,ans+")");
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n ");
        int n = sc.nextInt();
        printParenthesis(0,0,n,"");
    }
}

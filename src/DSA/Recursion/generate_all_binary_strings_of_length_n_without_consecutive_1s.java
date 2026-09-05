package DSA.Recursion;
import java.util.Scanner;
//generate all binary strings of length n without consecutive 1's
public class generate_all_binary_strings_of_length_n_without_consecutive_1s {
    public static void printStrings(String s, int n){
        int m = s.length();
        if(m == n){
            System.out.println(s);
            return;
        }
        if(m == 0 || s.charAt(m-1) == '0'){
            printStrings(s+0,n);
            printStrings(s+1,n);
        }
        else{
            printStrings(s+0,n);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n ");
        int n = sc.nextInt();
        printStrings("",n);
    }
}

package DSA.strings.question;

import java.util.Scanner;

//Input a string and print all the substrings of that string.
public class question2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcde";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}

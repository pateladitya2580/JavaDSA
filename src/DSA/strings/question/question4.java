package DSA.strings.question;

import java.util.Scanner;

//input a string and toggle all the characters of it.
//(replace small case with capital case and vice versa)
public class question4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int num = (int) ch;
            if(65 <= num && num <= 90){
                num = num + 32;
                char a = (char) num;
                sb.setCharAt(i,a);
            }
            else if (97 <= num && num<=122) {
                num = num - 32;
                char b = (char) num;
                sb.setCharAt(i,b);
            }
        }
        System.out.println(sb);
    }
}
/*
ASCII difference:

'A' = 65
'a' = 97

Difference = 32

To:

Uppercase → Lowercase = +32
Lowercase → Uppercase = -32
 */
package DSA.strings.question;

import java.util.Scanner;

//Input a string and count all the vowels in the given string.
public class question1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        int count = 0 ;
        int n = str.length();
        for(int i = 0 ; i<n;i++){
            char ch = str.charAt(i);
            if(isVowel(ch)==true) count++;
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if(ch == 'a'|| ch =='A')  return true;
        if(ch == 'e'|| ch =='E')  return true;
        if(ch == 'i'|| ch =='I')  return true;
        if(ch == 'o'|| ch =='O')  return true;
        if(ch == 'u'|| ch =='U')  return true;
        return false;
    }
}

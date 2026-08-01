package DSA.strings.question;

import java.util.Arrays;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class question9 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        char[] ph = t.toCharArray();
        Arrays.sort(ph);
        for(int i  = 0;i<s.length();i++){
            if(ch[i]!=ph[i]) return false;
        }
        return true;
    }
    static void main(String[] args) {

    }
}

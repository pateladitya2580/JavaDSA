package DSA.strings.question;

import java.util.Scanner;

//Reverse each word in a given sentence.(two pointer)
//(Ex:i am raghav garg -> i ma vahgar grag)
public class question5 {
    public static void reverse(StringBuilder sb,int start,int end){
        while (start<=end){
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String str  = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        int i = 0 ,j = 0;
        while (j<n){
            if(sb.charAt(j)!=' ') j++;
            else {
                reverse(sb,i,j-1);
                i = j+1;
                j = i;
            }
        }
        reverse(sb,i,j-1);// for last word
        System.out.println(sb);
    }
}

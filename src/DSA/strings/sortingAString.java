package DSA.strings;

import java.util.Arrays;

public class sortingAString {
    static void main(String[] args) {
        String s  = "Aditya";
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele +" ");
        }
        System.out.println();

        StringBuilder sb = new StringBuilder("Patel");
        String str = sb.toString();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for(char ele:arr){
            System.out.print(ele +" ");
        }
    }
}

package DSA.strings;

import java.util.Scanner;

public class stringBuilder {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Aditya");
        System.out.println(sb);
        System.out.println(sb.length());
        //string builder input
        System.out.println("Enter the string");
        StringBuilder tb = new StringBuilder(sc.nextLine());
        System.out.println(tb);
        //setcharAt(index,'character');
        tb.setCharAt(1,'a');
        System.out.println(tb);
    }
}

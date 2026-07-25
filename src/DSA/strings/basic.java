package DSA.strings;

import java.util.Scanner;

public class basic {
    static void main(String[] args) {
        //aditya
//        char[] arr = {'a','d','i','t','y','a'};
//        for(int i =0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//
//        String x = "Aditya Lodhi is an AIML Engneer";
//        System.out.println(x);

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.next();// ye string ke space ko consider nahi karta
        System.out.println(str);// but sc.nextLine() sab kuch consider karta hai spaces ko bhi
    }
}

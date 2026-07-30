package DSA.strings.question;

import java.util.Scanner;

//given a string consisting of lowercase English alphabets . Print the
//character that is occurring most number of times.
public class question6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[26];
        System.out.println("Enter the string ");
        String str = sc.nextLine();//abaaacrmnrra
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int num = ch;
            num = num -97;
            arr[num]++;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int i = 0;
        while(i<arr.length){
            if(arr[i]==max){
                int a = i;
                a+= 97;
                char b = (char) a;
                System.out.println("The cha that is occurring most no.of times "+b);
            }
            i++;
        }
    }
}

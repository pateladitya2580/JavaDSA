package DSA.array.question;

import java.util.Scanner;

public class question2 {
    //calculate the sum of all the elements in given array.
    // 81 17 95 36 31 100 60
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {81,17,95,36,31,100,60};
        int sum = 0;
        int n = arr.length;
        for(int i = 0 ;i<=n-1;i++){
            sum += arr[i];
        }
        System.out.println("The sum of all the elements in the given array is "+sum);
    }
}

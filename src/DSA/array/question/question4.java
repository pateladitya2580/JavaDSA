package DSA.array.question;

import java.util.Scanner;

public class question4 {
    // find the maximum value out of all the elements in the array.
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter val of array");
        for(int i = 0;i<=n-1;i++)
        {
            arr[i] = sc.nextInt();
        }
        //solution
        int maximum = arr[0];
        for(int i = 1 ;i<=n-1;i++){
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        System.out.println("Maximum value of array is "+maximum);
    }
}
//Math.max(a,b) ka maximum dega
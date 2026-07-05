package DSA.array.question;

import java.util.Scanner;

public class question5 {
    // find the second largest element in the given Array.
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
        int secondLargest = Integer.MIN_VALUE;
        int firstLargest = arr[0];
        for(int i = 1;i<=n-1;i++){
            if(arr[i]>firstLargest){
                firstLargest = arr[i];
            }
        }

        for(int i = 1;i<=n-1;i++){
            if(arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest no.is "+secondLargest);
    }
}

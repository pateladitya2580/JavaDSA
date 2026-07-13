package DSA.array.question;

import java.util.Scanner;

//find the doublet in the array whose sum is equal to the
//given value x.( Two Sum)
public class question6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        //solution
        for(int i = 0;i<=n-2;i++){
            for(int j = i+1;j<=n-1;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println("The elemests are "+arr[i]+" and " +arr[j]);
                }
            }
        }
    }
}

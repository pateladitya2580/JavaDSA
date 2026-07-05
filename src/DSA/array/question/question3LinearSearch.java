package DSA.array.question;

import java.util.Scanner;

public class question3LinearSearch {
    //find the element 'x' in the array.Take array and x as input
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
        System.out.println("Enter the value of X");
        int x = sc.nextInt();
        //solution
        boolean flag = false;
        for(int i = 0 ; i<=n-1;i++){
            if(arr[i]==x ){
                flag = true;
            }
            break;
        }
        if (flag == true){
            System.out.println("Element is found");
        }
        else {
            System.out.println("Element is not found");
        }
    }
}

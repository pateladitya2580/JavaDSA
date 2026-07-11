package DSA.array;

import java.util.Arrays;

public class copyOfArray {
    static void main(String[] args) {
        int[]arr = {30,10,40,23,89,34};
        for(int ele : arr){
            System.out.print(arr[ele]+"");
        }
        System.out.println();
        int[] nums = arr;// shallow copy
        for(int ele:arr){
            System.out.print(nums[ele]+" ");
        }
        //Deep Copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        for(int ele : brr){
            System.out.print(ele+" ");
        }
    }
}
/*
Pass by Value: Method ko variable ki value ki copy pass hoti hai.
Pass by Reference: Method ko object ka original reference pass hota hai
(Note: Java me actual pass by reference nahi hota, sirf reference ki copy
pass hoti hai).

Shallow Copy: Naya array reference banta hai, lekin elements (agar objects hain)
same objects ko point karte hain.
Deep Copy: Naya array aur uske sabhi elements ki independent copies banti hain.
 */
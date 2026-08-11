package DSA.BasicSortingAlgorithms;
/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
 //leetcode 169.
 */
public class MajorityElement {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        for(int i = 1; i<n ;i++){
            for(int j = i;j>=1;j--)
            {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        int mid = n/2;
        return arr[mid];
    }
    static void main(String[] args) {

    }
}

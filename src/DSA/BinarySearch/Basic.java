package DSA.BinarySearch;
/*
Binary Search is a searching algorithm used to find an element in a sorted
array by repeatedly dividing the search range into two halves.

Simple words:
Binary Search mein hum middle element check karte hain. Agar target middle
se chhota hai to left half, aur bada hai to right half mein search karte
hain.
leetcode 704
Important: Binary Search ke liye array ka sorted hona necessary hai.
 */
public class Basic {
    static void main(String[] args) {
        int []arr = {10,23,46,89,91,107,140,264};
        //BINARY SEARCH // Time Complexity = O(log n)
        int target = 46;
        int n = arr.length;
        boolean flag = false;
        int low = 0, high = n-1;
        while (low<=high){
            int mid = (low+high)/2; // ye formula chote array ke liye hai jiska
            if(arr[mid]<target) low = mid+1;// ans int ke ander ata hai yadi
            else if (arr[mid]>target) high = mid-1;//large array ate hai to ham
            else if ( arr[mid]== target){// low + (high - low)2 use karenge jis
                flag = true;// integer over flow error se bache
                break;
            }
        }
        if(flag==false) System.out.println("Element is not found");
        else System.out.println("Element is found");
    }
}

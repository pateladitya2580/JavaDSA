package DSA;

public class BS {
    static void main(String[] args) {
        int []arr = {10,23,46,89,91,107,140,264};
        int n = arr.length;
        int low = 0,high = n-1;
        int target = 107;
        boolean flag = true;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                flag = false;
                break;
            }
            else if(arr[mid]>target) high = mid-1;
            else if(arr[mid]<target) low = mid+1;
        }
        if(flag == true) System.out.println("Element is not found");
        else System.out.println("Element is found");
    }
}

package DSA.BinarySearch;
// Leet Code 69
public class SquareRootX {
    static void main(String[] args) {
        int x = 25;
        int low = 0, high = x;
        int ans = 0;
        while (low<=high){
            int mid = (low+high)/2;
            if(mid*mid==x){
                ans = mid;
                break;
            } else if (mid*mid>x) {
                high = mid +1;
            }
            else if (mid*mid<x){
                low = mid+1;
            }
        }
        System.out.println("Square root of "+x+" is "+ans);
    }
}

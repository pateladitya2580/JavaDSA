package DSA;

public class maxMin {
    static void main(String[] args) {
        int []arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        //max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max<arr[i]) max = arr[i];
        }
        System.out.println(max);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(min>arr[i]) min = arr[i];
        }
        System.out.println(min);
    }
}

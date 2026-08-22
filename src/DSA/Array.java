package DSA;

public class Array {
    static void main(String[] args) {
        int sum = 0;
        int []arr = {21,32,12,43,34,54,56};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("The sum is "+sum);
    }
}

package DSA;

public class arraySum {
    static void main(String[] args) {
        int []arr = {12,23,45,16,89};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum is "+sum);
    }
}

package DSA.array.question;
//Write a program to reverse the array without using any
//extra array
public class question7TwoPointers {
    static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        // two pointer method
        int i = 0 ,j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

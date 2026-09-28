package DSA.Stack.Question;
import java.util.*;
/*
Given a sequence of numbers.Remove all the consecutive subsequences
of length greater than or equal to 2 that contains the same element.
 */
public class Question6 {
    public static int[] remove(int []arr){
        Stack <Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(st.size()==0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if (st.peek()== arr[i]){
                if(i == n-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
        int []ans = new int[st.size()];
        for (int i = ans.length-1; i >=0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int []resultant = remove(arr);
        for (int i = 0; i < resultant.length; i++) {
            System.out.print(resultant[i]+" ");
        }
        System.out.println();
    }
}

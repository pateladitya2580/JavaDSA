package DSA.Stack.Question;
import java.util.*;
//Next greater element;
public class Question7 {
    /*
    NGE: Right se left traverse karo; current element se
    chhote/equal elements ko pop karo. Stack ka top agar
    available hai to wahi nearest greater element hai, warna -1.

    NGE -> right to left//Next Greater element
    PGE -> left to right//Previous Greater element
    baki sab same
     */
    public static int[] nextGreaterEle(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int [] ans = new int[n];
        st.push(arr[n-1]);//fixed step
        ans[n-1] = -1;// fixed step
        for(int i = n-2;i>=0;i--){
            while (st.size() > 0 && arr[i]>= st.peek()){
                st.pop();
            }
            if(st.size() == 0) {// matlab empty koi usse greater ele nahi hai
                ans[i] = -1;
            }
            else {//arr[i]<st.peek()
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    static void main(String[] args) {
        int []arr  = {1,5,3,2,1,6,3,4};//5 6 6 6 6 -1 4 -1
        int []resultant  = nextGreaterEle(arr);
        for (int i = 0; i < resultant.length; i++) {
            System.out.print(resultant[i]+" ");
        }
        System.out.println();
    }
}

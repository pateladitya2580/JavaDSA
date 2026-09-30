package DSA.Stack.Question;
import java.util.Stack;
//Sliding window maximum
public class Question11 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        // n -(k-1) -> n-k+1
        int []ans = new int[n-k+1];
        int z = 0;
        //NGE using index
        Stack<Integer> st = new Stack<>();
        int []nge = new int [n];
        st.push(n-1);
        nge[n-1] = n;
        for(int i = n-2;i>=0;i--){
            while(st.size()>0 && nums[i]>nums[st.peek()]){
                st.pop();
            }
            if(st.size()==0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }

        for(int i = 0;i<n-k+1;i++){
            int j = i;
            int max = nums[j];
            while(j< i+k){
                max = nums[j];
                j = nge[j];
            }
            ans[z++] = max;
        }
        return ans;
    }
    static void main(String[] args) {

    }
}
/*
1. NGE array banao
        ↓
2. Har window ke first element se start karo
        ↓
3. NGE ke through next greater element par jump karo
        ↓
4. Jab NGE window ke bahar chala jaye → stop
        ↓
5. Last valid element = window ka maximum
        ↓
6. Answer array mein store karo
        ↓
7. Next window par jao
 */
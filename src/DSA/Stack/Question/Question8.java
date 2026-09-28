package DSA.Stack.Question;
import java.util.*;
//Largest rectangle in Histogram Leet Code 84
public class Question8 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int nse[] = new int [n];
        int pse[] = new int [n];
        //nse
        nse[n-1] = n;
        st.push(n-1);
        for(int i = n-2;i>=0;i--){
            while(st.size()>0 && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }
        //empty the stack
        while(st.size()>0){
            st.pop();
        }
        //pse
        pse[0] = -1;
        st.push(0);
        for(int i = 1;i<n;i++){
            while(st.size()>0 && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }
        int max  = -1;
        for(int i = 0 ;i<n;i++){
            int width = nse[i] - pse[i] -1;
            int area = heights[i]*width;
            max = Math.max(max,area);
        }
        return max;
    }
    static void main(String[] args) {

    }
}
/*
GREATER:
Greater chahiye → chhote/equal pop karo.
Next chahiye → Right → Left.
Previous chahiye → Left → Right.
===============================================================================
SMALLER:
Smaller chahiye → bade/equal pop karo.
Next → Right → Left.
Previous → Left → Right
 */
package DSA.Stack.Question;
import java.util.*;
/*
⭐ Celebrity Problem
Given an n × n binary matrix M:
- M[i][j] = 1 → Person i knows Person j
- M[i][j] = 0 → Person i doesn't know Person j
Celebrity ki conditions
Celebrity woh person hai jo:
1. Kisi ko nahi jaanta → uski complete row 0 honi chahiye.
2. Sab usko jaante hain → uska column, except diagonal, 1 hona chahiye
 */
public class Question10 {
    static void main(String[] args) {
        int [][] arr = {{0,1,0,0},{0,0,0,0},{1,1,0,1},{1,1,0,0}};// 0 1 2 3
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size()>1){
            int i = st.pop();
            int j = st.pop();
            if(arr[i][j]==0) st.push(i);
            else st.push(j);
        }

        int celeb = st.peek();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(i!=celeb && (arr[i][celeb] == 0 || arr[celeb][i] == 1)){
                flag = true;
                break;
            }
        }
        if(flag == true) System.out.println(-1);
        else System.out.println(celeb);
    }
}

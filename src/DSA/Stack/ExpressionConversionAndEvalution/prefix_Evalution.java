package DSA.Stack.ExpressionConversionAndEvalution;

import java.util.Stack;

public class prefix_Evalution {
    static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<>();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci >= 48 && asci <= 57){
                st.push(asci-48);
            }
            else {
                int v1 = st.pop();
                int v2 = st.pop();
                if(ch == '+') st.push(v1 + v2);
                if(ch == '-') st.push(v1 - v2);
                if(ch == '*') st.push(v1 * v2);
                if(ch == '/') st.push(v1 / v2);
            }
        }
        System.out.println(st.peek());
    }
}
/*
isme loop ulta chalta hai post fix ke compare me
or v1 ,v2 bhi ulte mante hai
Operator mila
     ↓
Stack se v1 pop
     ↓
Stack se v2 pop
     ↓
v1 operator v2
     ↓
Result ko stack mein push
 */
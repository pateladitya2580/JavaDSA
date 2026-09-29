package DSA.Stack.ExpressionConversionAndEvalution;
import java.util.Stack;
public class Postfix_Evalution {
    static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci >= 48 && asci <= 57){
                st.push(asci-48);
            }
            else {
                int v2 = st.pop();
                int v1 = st.pop();
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
Operator mila
     ↓
Stack se v2 pop
     ↓
Stack se v1 pop
     ↓
v1 operator v2
     ↓
Result ko stack mein push
 */
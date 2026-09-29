package DSA.Stack.ExpressionConversionAndEvalution;
import java.util.*;
public class prefix_to_infix {
    static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String str = "-9/*+5346";
        int n = str.length();
        for (int i = n-1; i >=0; i--) {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57){
                String s = ""+ch;
                val.push(s);
            }
            else {
                String v1 = val.pop();
                String v2 = val.pop();
                String o = ""+ch;
                String t = "("+v1 + o + v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek());//(9-(((5+3)*4)/6))
    }
}
/*
Prefix → Infix Algorithm
Example: -9/*+5346
1. Ek Stack<String> lo.
2. Prefix expression ko Right → Left traverse karo.
3. Agar character operand hai → stack me push karo.
4. Agar character operator hai:
   - v1 = stack.pop()
   - v2 = stack.pop()
   - Infix expression banao:(v1 operator v2)
   - Is result ko stack me push karo.
5. Puri expression traverse hone ke baad stack ke top par final Infix expression milega.
 */
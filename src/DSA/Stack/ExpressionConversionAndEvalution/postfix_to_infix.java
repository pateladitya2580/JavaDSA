package DSA.Stack.ExpressionConversionAndEvalution;
import java.util.*;
public class postfix_to_infix {
    static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String str = "953+4*6/-";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57){
                String s = ""+ch;
                val.push(s);
            }
            else {
             String v2 = val.pop();
             String v1 = val.pop();
             String o = ""+ch;
             String t = "("+v1 + o + v2+")";
             val.push(t);
            }
        }
        System.out.println(val.peek());//(9-(((5+3)*4)/6))
    }
}
/*
Postfix → Infix Algorithm

Example: 953+4*6/-

1. Ek Stack<String> lo.
2. Postfix expression ko Left → Right traverse karo.
3. Agar character operand hai → usko stack me push karo.
4. Agar character operator hai:
   - v2 = stack.pop()
   - v1 = stack.pop()
   - Infix expression banao:(v1 operator v2)
   - Is newly formed expression ko stack me push karo.
5. Puri expression traverse hone ke baad stack ke top par final Infix expression milega.
 */
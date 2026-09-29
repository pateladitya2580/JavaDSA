package DSA.Stack.ExpressionConversionAndEvalution;
import java.util.Stack;
public class postfix_to_prefix {
    static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String str = "953+4*6/-";
        int n = str.length();
        for (int i = 0; i < n ; i++) {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57){
                String s = ""+ch;
                val.push(s);
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                String o = ""+ch;
                String t = o + v1+v2;
                val.push(t);
            }
        }
        System.out.println(val.peek());//-9/*+5346
    }
}
/*
Postfix → Prefix
Postfix format: Operand1 Operand2 Operator
Example: 953+4*6/-
Algorithm
1. Ek Stack<String> lo.
2. Postfix expression ko left to right traverse karo.
3. Agar character operand hai → stack me push karo.
4. Agar character operator hai:
   - v2 = stack.pop()
   - v1 = stack.pop()
   - Prefix expression banao: operator + v1 + v2
   - Result ko stack me push karo.
5. Traversal complete hone ke baad stack ka top final prefix expression hoga.
 */
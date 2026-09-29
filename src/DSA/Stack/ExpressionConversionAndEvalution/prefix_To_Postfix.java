package DSA.Stack.ExpressionConversionAndEvalution;
import java.util.*;
public class prefix_To_Postfix {
    static void main(String[] args) {
     Stack<String> val = new Stack<>();
     String str = "-9/*+5346";
     int n = str.length();
        for (int i = n-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57){
                String s = ""+ch;
                val.push(s);
            }
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                String o = ""+ch;
                String t = v1+v2+o;
                val.push(t);
            }
        }
        System.out.println(val.peek());//953+4*6/-
    }
}
/*
1. Prefix → Postfix
Prefix format: Operator Operand1 Operand2
Example: -9/*+5346
Algorithm
1. Ek Stack<String> lo.
2. Prefix expression ko right to left traverse karo.
3. Agar character operand hai → stack me push karo.
4. Agar character operator hai:
   - v1 = stack.pop()
   - v2 = stack.pop()
   - Postfix expression banao: v1 + v2 + operator
   - Result ko stack me push karo.
5. Traversal complete hone ke baad stack ka top final postfix expression hoga.
 */
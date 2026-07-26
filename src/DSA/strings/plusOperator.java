package DSA.strings;

public class plusOperator {
    static void main(String[] args) {
        String s = "abc";
        String t = "pqr";
        s = s + t; //s+=t;//abcpqr
        s = 10 + s;
        System.out.println(s);//10adcpqr
        System.out.println("abc"+10+20);//precedence same hai +,+ islye left to right chalega
        System.out.println(10+20+"abc");
    }
}

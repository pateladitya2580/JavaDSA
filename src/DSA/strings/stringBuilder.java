package DSA.strings;

import java.util.Scanner;

public class stringBuilder {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Aditya");
        System.out.println(sb);
        System.out.println(sb.length());

        //string builder input
//        System.out.println("Enter the string");
//        StringBuilder tb = new StringBuilder(sc.nextLine());
//        System.out.println(tb);

        //setcharAt(index,'character');
        sb.setCharAt(1,'a');
        System.out.println(sb);

        //append (last me add karna )
        sb.append(" Patel");
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);

        StringBuilder st = new StringBuilder("abcdxyz");

        st.deleteCharAt(0);//bcdxyz
        System.out.println(st);

        st.delete(0,2);//dxyz
        System.out.println(st);

        st.insert(2,'g');//dxgyz
        System.out.println(st);
    }
}

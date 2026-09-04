package DSA.Recursion;
//Remove all occurrences of 'a' from a string.
public class skip_a_character {
    public static void printstr(int i ,String s ,String ans){
        if(i == s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a') ans += s.charAt(i);
        printstr(i+1,s,ans);
    }
    static void main(String[] args) {
        String s = "Aditya Patel";
        printstr(0,s,"");
    }
}

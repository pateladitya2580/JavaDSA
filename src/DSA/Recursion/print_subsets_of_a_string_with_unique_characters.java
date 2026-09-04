package DSA.Recursion;
import java.util.ArrayList;
public class print_subsets_of_a_string_with_unique_characters {
    static ArrayList<String>arr = new ArrayList<>();//global
    public static void subsets(int i , String s,String ans){
        if(i == s.length()){
            arr.add(ans);
            return;
        }
        subsets(i+1,s,ans); // not take
        ans += s.charAt(i);
        subsets(i+1,s,ans);// take
    }
    static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>();// reset multiple test case me problem na ho isliye reseat kia hai
        subsets(0,s," ");
        System.out.println(arr);
    }
}

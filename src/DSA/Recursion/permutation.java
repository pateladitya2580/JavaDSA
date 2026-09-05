package DSA.Recursion;

public class permutation {
    public static void permutationCom(String ans , String s){
        if(s.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            String leftsub = s.substring(0, i);
            String rightsub = s.substring(i+1);
            permutationCom(ans+ch,leftsub+rightsub);
        }
    }
    static void main(String[] args) {
        String s = "abc";
        permutationCom("",s);
    }
}

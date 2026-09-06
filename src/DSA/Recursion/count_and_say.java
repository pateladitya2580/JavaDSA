package DSA.Recursion;
// leet code 38
// countandsay(n) is the way you "say" countandsay(n-1)
public class count_and_say {
    public String countAndSay(int n) {
        if(n == 1) return "1";//base case
        String s = countAndSay(n-1);
        //now we have to modify s
        String ans = "";
        int i = 0;
        int j = 0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len = j-i;
                ans +=len;
                ans += s.charAt(i);
                i = j;
            }
        }
        int len = j-i;
        ans +=len;
        ans += s.charAt(i);
        return ans;

    }
    static void main(String[] args) {
    }
}
/*
ALGORITHM ,Har iteration mein;
current string lo
↓
i = 0 se traverse karo
↓
same consecutive characters count karo
↓
count + character result mein append karo
↓
next group par chale jao
 */
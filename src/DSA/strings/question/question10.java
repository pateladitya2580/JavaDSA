package DSA.strings.question;
//Compress a given string.ld 443
/*
ex s = "aaaabbcddeff"
   ans = ""a4b2cd2ef2"
 */
public class question10 {
    static void main(String[] args) {
        String s = "aaaabbcddeff";
        char[] arr = s.toCharArray();
        int i=0,j=0;
        String ans = "";
        while (j<arr.length){
            if(arr[j]==arr[i]) j++;
            else{
                ans += arr[i];
                int len = j-i;
                if(len>1){
                    ans+=len;
                }
                i = j;
            }
        }
        ans += arr[i];
        int len = j-i;
        if(len>1){
            ans+=len;
        }
        System.out.println(ans);
    }
}

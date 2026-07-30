package DSA.strings.question;
//Given two strings s and t , determine if they are isomorphic.LC 205
public class question7 {
    public static boolean isomorphic(String s,String t){
        if(s.length()!=t.length()) return false;
        char [] freq = new char[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch;
            if(freq[idx]== '\0'){ // s to t me dal kar dekho
                freq[idx] = dh;// alag alag hai ki nahi
            }
            else if (freq[idx]!= dh) {
                return false;
            }
        }
        for (int i = 0; i < 128; i++) {
            freq[i] = '\0';
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int)ch;
            if(freq[idx]== '\0'){// t to s me dal kar dekho
                freq[idx] = dh;//alag alag hai ki nahi
            }
            else if (freq[idx]!= dh) return false;
        }
        return true;
    }
    static void main(String[] args) {

    }
}

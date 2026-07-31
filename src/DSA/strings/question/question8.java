package DSA.strings.question;
//Given n String consisting of digits from 0 to 9 . Return the string which
//has maximum value.(the no. are positive)
public class question8 {
    static void main(String[] args) {
        String []arr = {"12234","676543","675364"};
        String MaxString = arr[0];
        for (int i = 1; i < arr.length; i++) {
            MaxString = max(MaxString,arr[i]);
        }
        System.out.println(MaxString);
    }

    public static String max(String a,String b){
        String s = purify(a); String t = purify(b);
        if(s.length()>t.length()) return  a;
        if(s.length()<t.length()) return b;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)!=t.charAt(i)){
               if(s.charAt(i)>t.charAt(i)) return a;
               else return b;
           }
        }
        if(a.length()>=b.length())return a;
        else return b;
    }
    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0') return s.substring(i);//!= ka matlab hota hai "not equal to" (barabar nahi hai).
        }
        return s;
    }
}
/*
!= ko simple language mein yaad rakho:

"Jab tak ye uske barabar nahi hai, tab tak condition true rahegi."
 */
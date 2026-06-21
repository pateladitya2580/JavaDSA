package JavaLanguage.OOPS;
class Crickerers{
    final String country = "India";
    //final Java ka ek keyword hai jo kisi variable,
    // method ya class ko modify hone se rokta hai.
    int runs;
    String name;
    double avg;
}
public class finalAndStaticKeyword {
    static void main(String[] args) {
        Crickerers c1 = new Crickerers();
        //c1.country = "england";error
    }
}
/*
1. Static Variable

Ek hi copy banti hai aur sabhi objects usi copy ko share karte hain.

class Student {
    static String college = "RGPV";
}

Access:

System.out.println(Student.college);
2. Static Method

Static method ko call karne ke liye object ki zarurat nahi hoti.

class Demo {
    static void show() {
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo.show();
    }
}

Important Points
static members class ke hote hain, object ke nahi.
Unhe access karne ke liye object banana zaroori nahi.
Static method directly sirf static members ko access kar sakta hai.
Non-static members ko access karne ke liye object chahiye.
One-Line Revision
Static Variable → Sabhi objects ke liye ek hi copy.
Static Method → Object ke bina call ho sakta hai.
 */
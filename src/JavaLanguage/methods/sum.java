package JavaLanguage.methods;

import java.util.Scanner;

public class sum {
    static int sum(int x,int y){
        int s = x+y;
        return s;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no .");
        int a = sc.nextInt();
        System.out.println("Enter the second no.");
        int b = sc.nextInt();
        int c = sum(a,b);
        System.out.print("The sum is "+c);
    }
}
/*
Java me static aur non-static methods ko samajhne ke liye ye samjho ki method kis se belong karta hai: class se ya object se.

1. Static Method
class Demo {

    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet();
    }
}
Ye kya hai?

greet() ke aage static laga hua hai.

static void greet()

Iska matlab:

Ye method class ka method hai, kisi object ka nahi.

Isliye ise call karne ke liye object ki zaroorat nahi hoti.

greet();

ya

Demo.greet();

dono sahi hain.

JVM kya karti hai?

Program start hote hi:

Demo class load hoti hai
↓
main() execute hota hai
↓
greet() available hota hai

Kyuki greet() class ke saath hi memory me aa chuka hota hai.

2. Non-Static Method
class Demo {

    void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.greet();
    }
}

Yahan:

void greet()

Non-static method hai.

Iska matlab:

Ye method object ka method hai.

Object ke bina ise call nahi kar sakte.

Java object kyu maangti hai?

Maan lo:

Demo d1 = new Demo();
Demo d2 = new Demo();
Demo d3 = new Demo();

Ab agar tum likho:

greet();

Java sochegi:

d1 ka greet() chalau?

d2 ka?

Ya d3 ka?

Java ko nahi pata.

Isliye object dena padta hai:

d1.greet();

Ab Java ko exact pata hai kis object ka method chalana hai.
 */

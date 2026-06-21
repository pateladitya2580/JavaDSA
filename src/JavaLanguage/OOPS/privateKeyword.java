package JavaLanguage.OOPS;

class Student {
    String name;
    private int roll;

    void print() { // getter
        System.out.println(name + " " + roll);
    }

    int getRno() {     // getter
        return roll;
    }

    void setRno(int x) { //setter
        roll = x;
    }
}

public class privateKeyword {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Aditya";
        s1.setRno(101);

        s1.print();

        System.out.println("Roll No = " + s1.getRno());
    }
}
/*
### **1. Private Keyword (Definition)**

> **`private` ek access modifier hai jo kisi variable, method ya constructor ko sirf usi class ke andar access karne deta hai. Dusri class usse directly access nahi kar sakti.**

---

### **2. Getter (Definition)**

> **Getter ek `public` method hota hai jo `private` variable ki value ko read (return) karne ke liye use kiya jata hai. Getter data ko sirf access karta hai, uski value change nahi karta.**

---

### **3. Setter (Definition)**

> **Setter ek `public` method hota hai jo `private` variable ki value ko set ya update karne ke liye use kiya jata hai. Iske through private data ko safely modify kiya jata hai.**

---

### 📌 One-Line Revision

* **Private** → Sirf same class ke andar access hota hai.
* **Getter** → Private variable ki **value read (return)** karta hai.
* **Setter** → Private variable ki **value set/update** karta hai.

 */
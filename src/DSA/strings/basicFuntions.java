package DSA.strings;
/*
```text
// ===================== Java String Methods =====================

// 1. length()
// String ki total length (characters ki count) return karta hai.

Syntax:
str.length();

Example:
String str = "Aditya";
str.length();          // Output: 6


// =============================================================

// 2. charAt(i)
// i index par jo character hota hai, wo return karta hai.

Syntax:
str.charAt(i);

Example:
String str = "Aditya";
str.charAt(2);         // Output: i


// =============================================================

// 3. indexOf('a')
// Character ya String ka first index return karta hai.
// Agar nahi mile to -1 return karta hai.

Syntax:
str.indexOf('a');

Example:
String str = "Aditya";
str.indexOf('a');      // Output: 5


// =============================================================

// 4. lastIndexOf('a')
// Character ya String ka last index return karta hai.
// Agar nahi mile to -1 return karta hai.

Syntax:
str.lastIndexOf('a');

Example:
String str = "Banana";
str.lastIndexOf('a');  // Output: 5


// =============================================================

// 5. contains("text")
// Check karta hai ki given text string ka part hai ya nahi.
// Output: true ya false

Syntax:
str.contains("text");

Example:
String str = "Aditya";
str.contains("dit");   // Output: true
str.contains("xyz");   // Output: false


// =============================================================

// 6. startsWith("text")
// Check karta hai ki string given text se start hoti hai ya nahi.
// Output: true ya false

Syntax:
str.startsWith("text");

Example:
String str = "Aditya";
str.startsWith("Adi"); // Output: true


// =============================================================

// 7. endsWith("text")
// Check karta hai ki string given text se end hoti hai ya nahi.
// Output: true ya false

Syntax:
str.endsWith("text");

Example:
String str = "Aditya";
str.endsWith("tya");   // Output: true


// =============================================================

// 8. toLowerCase()
// String ke sabhi letters ko lowercase me convert karta hai.

Syntax:
str = str.toLowerCase();

Example:
String str = "HELLO";
str = str.toLowerCase();   // Output: hello


// =============================================================

// 9. toUpperCase()
// String ke sabhi letters ko uppercase me convert karta hai.

Syntax:
str = str.toUpperCase();

Example:
String str = "hello";
str = str.toUpperCase();   // Output: HELLO


// =============================================================

// 10. concat()
// Do strings ko jodta (concatenate) hai.
// Original string change nahi hoti, isliye result ko store karna padta hai.

Syntax:
str = str.concat(a);

Example:
String str = "Hello";
str = str.concat(" World");

// Output:
Hello World


// ===================== Important Points =====================

// ✔ Strings are Immutable.
// Original string tabhi change hogi jab result ko store karoge.

str.toUpperCase();         // Original string same rahegi.
str = str.toUpperCase();   // Ab string uppercase ho jayegi.


// ===================== Quick Revision =====================

// length()          → String ki length
// charAt(i)         → i index ka character
// indexOf()         → First occurrence ka index
// lastIndexOf()     → Last occurrence ka index
// contains()        → Text present hai ya nahi (true/false)
// startsWith()      → Given text se start hoti hai ya nahi
// endsWith()        → Given text se end hoti hai ya nahi
// toLowerCase()     → Lowercase me convert
// toUpperCase()     → Uppercase me convert
// concat()          → Do strings ko jodta hai
```

// ===================== substring() =====================

// 1. substring(i)
// i index se last tak ki string return karta hai.

Syntax:
str.substring(i);

Example:
String str = "Aditya";
str.substring(2);     // Output: itya


// 2. substring(i, j)
// i index se j-1 index tak ki string return karta hai.
// i included hota hai, j included nahi hota.

Syntax:
str.substring(i, j);

Example:
String str = "Aditya";
str.substring(1, 4);   // Output: dit


// ===================== Important Points =====================

// i = Starting index (Included)
// j = Ending index (Excluded)

// substring(i)      -> i se last tak
// substring(i, j)   -> i se j-1 tak

// Agar index invalid ho ya i > j ho,
// to StringIndexOutOfBoundsException aata hai.


// ===================== Example =====================

String str = "Programming";

// Index:
P  r  o  g  r  a  m  m  i  n  g
0  1  2  3  4  5  6  7  8  9 10

str.substring(3);      // gramming
str.substring(3, 7);   // gram
str.substring(0, 4);   // Prog
str.substring(7);      // ming
 */
public class basicFuntions {
}

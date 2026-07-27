package DSA.strings;

public class stringEquals {
    /*
    Java Strings: == vs .equals()
Definition
== Operator
-Used to compare references (memory addresses) of two String objects.
-Returns true only if both variables point to the same object.
.equals() Method
-Used to compare the contents (characters) of two Strings.
-Returns true if both Strings contain the same sequence of characters.
Difference Between == and .equals()
==	                                    .equals()
Compares object references	             Compares string contents
Checks memory address	                 Checks character sequence
Returns true only for the same object	 Returns true if text is the same
Operator	                             Method of the String class
Example 1: ==
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);

Output:

false

Reason: s1 and s2 are different objects in memory.

Example 2: .equals()
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1.equals(s2));

Output:

true

Reason: Both strings have the same content ("Java").

Example 3: String Pool
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));

Output:

true
true

Reason: String literals are stored in the String Pool, so both variables refer to the same object.

Example 4: Mixed Case
String s1 = "Java";
String s2 = new String("Java");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));

Output:

false
true
     */
}

package DSA.Sliding_Windows;

public class Basic {
    static void main(String[] args) {

    }
}

/*
==================================================
              SLIDING WINDOW
==================================================

1. INTRODUCTION

- Sliding Window ek technique hai jo mainly Arrays aur Strings
  ke contiguous subarrays ya substrings par kaam karti hai.

- Isme hum ek window maintain karte hain jisme Left aur Right
  pointers use hote hain.

- Window ko move karke answer find karte hain, bina baar-baar
  poori window ka calculation kiye.

- Is technique se repeated calculations avoid hoti hain
  aur time complexity improve hoti hai.


2. WHY SLIDING WINDOW?

- Brute Force approach mein baar-baar subarray ya substring
  ka calculation karna padta hai.

- Sliding Window mein hum previous window ka result use
  karke next window ka result calculate karte hain.

Example:

Array = [2, 1, 5, 1, 3, 2]
K = 3

Possible windows:

[2, 1, 5] = 8
[1, 5, 1] = 7
[5, 1, 3] = 9
[1, 3, 2] = 6

Maximum Sum = 9

Next window calculate karne ke liye:

New Window Sum =
Previous Window Sum - Outgoing Element + Incoming Element

Isse baar-baar poori window ka sum calculate nahi karna padta.


3. TYPES OF SLIDING WINDOW

A. Fixed Size Window

- Isme window ka size constant rehta hai.
- Window ka size K hota hai.
- Har step par ek element remove aur ek element add hota hai.

Common Problems:
- Maximum Sum Subarray of Size K
- Average of Subarrays of Size K
- First Negative Number in Every Window


B. Variable Size Window

- Isme window ka size change hota rehta hai.
- Condition ke according window expand ya shrink hoti hai.
- Jab condition satisfy nahi hoti, tab window shrink karte hain.

Common Problems:
- Longest Subarray with Sum K
- Minimum Size Subarray Sum
- Longest Substring Without Repeating Characters


4. TWO POINTERS IN SLIDING WINDOW

- Sliding Window mein generally do pointers use hote hain:

Left Pointer:
- Window ka starting index represent karta hai.

Right Pointer:
- Window ka ending index represent karta hai.

Window Size Formula:

Window Size = Right - Left + 1

Important Operations:

1. Expand Window:
   Right pointer ko aage move karna.

2. Shrink Window:
   Left pointer ko aage move karna.

3. Current Window:
   Left se Right tak ke elements.


5. IMPORTANT FORMULAS

Fixed Size Window:

New Window Sum =
Previous Sum - Outgoing Element + Incoming Element


Window Size:

Right - Left + 1


6. SLIDING WINDOW VS TWO POINTERS

Sliding Window:
- Mainly contiguous subarrays aur substrings par use hota hai.
- Ek continuous range maintain ki jaati hai.
- Window expand aur shrink hoti hai.

Two Pointers:
- Do pointers ko different positions par maintain karte hain.
- Sorted arrays, pair problems aur linked lists mein bhi use hota hai.
- Dono pointers ek doosre ki taraf ya same direction mein move
  kar sakte hain.


7. TIME AND SPACE COMPLEXITY

Time Complexity:
- Generally O(n)
- Har element ko limited number of times process kiya jata hai.

Space Complexity:
- O(1), agar extra data structure use nahi ho raha.
- O(n), agar HashMap ya HashSet jaise data structures use ho rahe hain.


8. IMPORTANT OBSERVATIONS

- Sliding Window sirf contiguous elements ke liye hota hai.
- Subarray aur substring contiguous hote hain.
- Subsequence mein elements contiguous hona zaroori nahi hai.
- Fixed Window mein size constant rehta hai.
- Variable Window mein size condition ke according change hota hai.
- Negative numbers hone par sum-based Variable Sliding Window
  generally reliable nahi hota.


9. QUICK REVISION

- Sliding Window = Contiguous Range
- Left = Starting Pointer
- Right = Ending Pointer
- Window Size = Right - Left + 1
- Fixed Window = Constant Size
- Variable Window = Changing Size
- Expand = Right++
- Shrink = Left++
- General Time Complexity = O(n)

==================================================
*/

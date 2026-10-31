package DSA.HashMaps_and_HashSets;

import java.util.HashSet;

public class Basic {
    static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();// set me elements random
        // order me jate hai or random order me aate hai
        //Insert : TC = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println("Size is "+set.size());// size TC = O(1)
        set.add(-8);
        set.add(200);
        System.out.println("Size is "+set.size());
        //search - true/false : TC = O(1)
        System.out.println(set.contains(50));
        set.add(50);
        System.out.println("Size is "+set.size());
        System.out.println(set.contains(50));
        System.out.println(set);
        set.remove(100);// TC = O(1)
        System.out.println(set);
        System.out.println("Seze is  "+set.size());

        Object[] arr = set.toArray();
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // In hashset occurence of every element is 1
    }
}
/*
# HASHSET IN JAVA – COMPLETE BASIC NOTES

## 1. What is HashSet?

HashSet is a class in Java Collections Framework used to store unique elements.

- Duplicate elements are not allowed.
- Insertion order is not maintained.
- Index-based access is not available.
- Internally, HashSet uses HashMap.
- It provides O(1) average time complexity for basic operations.

### Example:
```
import java.util.HashSet;

public class Basic {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println(set);
    }
}
```

Output (order may vary):
```
[10, 20, 30]
```

Note: 10 was inserted twice, but HashSet stores it only once.

---

## 2. Properties of HashSet

1. Unique Elements:
   - Duplicate elements are not allowed.
   - Each element is stored only once.
2. Unordered:
   - Insertion order is not maintained.
   - Elements may appear in a different order.
3. No Indexing:
   - Elements cannot be accessed using an index.
   - set.get(0) is not supported.
4. Null Values:
   - HashSet allows only one null element.
5. Heterogeneous Elements:
   - HashSet can store different types of objects when declared without a restrictive generic type.
   - Example: HashSet\<Object>.
6. Internal Working:
   - HashSet internally uses HashMap.
   - Elements are stored as keys in the internal HashMap.
7. Synchronization:
   - HashSet is not thread-safe by default.

---

## 3. HashSet Declaration

Syntax:
```
HashSet<DataType> set = new HashSet<>();
```

Examples:
```
HashSet<Integer> set1 = new HashSet<>();

HashSet<String> set2 = new HashSet<>();

HashSet<Character> set3 = new HashSet<>();

HashSet<Double> set4 = new HashSet<>();
```

### Wrapper Classes

Java collections cannot directly store primitive data types.

Therefore, wrapper classes are used.

- int → Integer
- char → Character
- double → Double
- float → Float
- boolean → Boolean
- long → Long
- short → Short
- byte → Byte

Example:
```
HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
```

---

## 4. Important HashSet Methods

### A. add() – Insert Element

Used to insert an element into HashSet.
```
set.add(10);
set.add(20);
set.add(30);
set.add(10);
```

Return Type: boolean

- Returns true if a new element is inserted.
- Returns false if the element already exists.

Example:
```
System.out.println(set.add(10)); // true
System.out.println(set.add(10)); // false
```

Average TC: O(1)

### B. contains() – Search Element

Used to check whether an element exists in HashSet.
```
System.out.println(set.contains(20)); // true

System.out.println(set.contains(50)); // false
```

Return Type: boolean

- true → Element exists.
- false → Element does not exist.

Average TC: O(1)

### C. remove() – Delete Element

Used to remove an element from HashSet.
```
set.remove(20);
```

Return Type: boolean

- true → Element was present and removed.
- false → Element was not present.

Average TC: O(1)

### D. size() – Count Elements

Returns the total number of elements.
```
System.out.println(set.size());
```

Return Type: int

TC: O(1)

### E. isEmpty() – Check Empty or Not

Checks whether HashSet contains any elements.
```
System.out.println(set.isEmpty());
```

Return Type: boolean

- true → HashSet is empty.
- false → HashSet contains elements.

TC: O(1)

### F. clear() – Remove All Elements

Removes all elements from HashSet.
```
set.clear();
```

After clear(), size becomes 0.

TC: O(n)

### G. iterator() – Traverse Elements

Used to traverse HashSet elements one by one.

Example 1: Enhanced For Loop
```
for(int x : set) {
    System.out.println(x);
}
```

Example 2: Iterator
```
import java.util.Iterator;

Iterator<Integer> it = set.iterator();

while(it.hasNext()) {
    System.out.println(it.next());
}
```

- hasNext() → Checks whether another element exists.
- next() → Returns the next element.

Traversal TC: O(n)

### H. toArray() – Convert HashSet into Array

Used to convert HashSet elements into an array.
```
Integer[] arr = set.toArray(new Integer[0]);
```

Now elements can be accessed using indexes.
```
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

TC: O(n)

---

## 5. Time Complexity of HashSet

Basic operations have O(1) average time complexity.

- add()       → Average O(1), Worst O(n)
- remove()    → Average O(1), Worst O(n)
- contains()  → Average O(1), Worst O(n)
- size()      → O(1)
- isEmpty()   → O(1)
- clear()     → O(n)
- Traversal   → O(n)
- toArray()   → O(n)

Note:

1. Average O(1) is possible because of hashing.
2. Worst-case O(n) can occur due to hash collisions.
3. Java 8+ can convert heavily collided buckets into tree structures under certain conditions, improving collision-heavy lookup performance.

---

## 6. Complete Example
```
import java.util.HashSet;
import java.util.Iterator;

public class Basic {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        // Print HashSet
        System.out.println(set);

        // Size
        System.out.println(set.size());

        // Searching
        System.out.println(set.contains(20));

        // Deletion
        set.remove(20);

        // Traversal
        for(int x : set) {
            System.out.println(x);
        }

        // Iterator
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Array Conversion
        Integer[] arr = set.toArray(new Integer[0]);

        // Clear
        set.clear();

        System.out.println(set.isEmpty());
    }
}
```

---

## 7. HashSet vs ArrayList

### ArrayList

- Allows duplicate elements.
- Maintains insertion order.
- Supports indexing.
- Searching takes O(n) time.

### HashSet

- Does not allow duplicate elements.
- Does not maintain insertion order.
- Does not support indexing.
- Searching takes O(1) average time.

---

## 8. Important Internal Concepts

HashSet internally uses HashMap.

Three important concepts:

1. hashCode()
   - Generates an integer hash code for an object.
   - Helps determine the bucket.
2. equals()
   - Checks whether two objects are equal.
   - Helps identify duplicate elements.
3. Hashing
   - Converts a hash code into a bucket location.

Important Rule:

If two objects are equal according to equals(), they must have the same hashCode().

---

## 9. Applications of HashSet in DSA

1. Finding duplicate elements in an array.
2. Counting distinct elements.
3. Finding common elements between two arrays.
4. Checking whether an element exists.
5. Finding unique characters in a string.
6. Detecting duplicates in a collection.
7. Tracking visited nodes in graph problems.
8. Optimizing searching operations.

---

## 10. Important LeetCode Practice Questions

1. LC 217 – Contains Duplicate
2. LC 771 – Jewels and Stones
3. LC 349 – Intersection of Two Arrays
4. LC 350 – Intersection of Two Arrays II
5. LC 128 – Longest Consecutive Sequence
6. LC 36 – Valid Sudoku
7. LC 202 – Happy Number

---

## 11. Quick Revision

- HashSet stores unique elements.
- Duplicate elements are not allowed.
- Insertion order is not maintained.
- Indexing is not supported.
- One null element is allowed.
- add() inserts elements.
- contains() searches elements.
- remove() deletes elements.
- size() returns total elements.
- clear() removes all elements.
- HashSet internally uses HashMap.
- Average time complexity of add(), remove() and contains() is O(1).
- hashCode() and equals() are important for duplicate detection.

END OF HASHSET BASIC NOTES
 */
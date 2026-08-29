package DSA.BinarySearch;
/*
Binary Search is a searching algorithm used to find an element in a sorted
array by repeatedly dividing the search range into two halves.

Simple words:
Binary Search mein hum middle element check karte hain. Agar target middle
se chhota hai to left half, aur bada hai to right half mein search karte
hain.
leetcode 704
Important: Binary Search ke liye array ka sorted hona necessary hai.
 */
public class Basic {
    static void main(String[] args) {
        int []arr = {10,23,46,89,91,107,140,264};
        //BINARY SEARCH // Time Complexity = O(log n)
        int target = 46;
        int n = arr.length;
        boolean flag = false;
        int low = 0, high = n-1;
        while (low<=high){
            int mid = (low+high)/2; // ye formula chote array ke liye hai jiska
            if(arr[mid]<target) low = mid+1;// ans int ke ander ata hai yadi
            else if (arr[mid]>target) high = mid-1;//large array ate hai to ham
            else if ( arr[mid]== target){// low + (high - low)2 use karenge jis
                flag = true;// integer over flow error se bache
                break;
            }
        }
        if(flag==false) System.out.println("Element is not found");
        else System.out.println("Element is found");
    }
}
/*
# Binary Search — Complete Notes

## 1. What is Binary Search?

Binary Search is a searching algorithm that reduces the search space by approximately half at every step.

**Time Complexity:** `O(log N)`
**Space Complexity:** `O(1)` for iterative implementation.

---

# 2. Types of Binary Search

There are two major ways to apply Binary Search:

1. **Binary Search on Array**
2. **Binary Search on Answer**

---

## 3. Binary Search on Array

Used when we need to search for a target inside a **sorted/ordered array**.

### Example

```
Array  = [1, 3, 5, 7, 9, 11]
Target = 7
```

### Search Space

```
0 → n - 1
```

### Basic Template

```java
int low = 0;
int high = nums.length - 1;

while (low <= high) {

    int mid = low + (high - low) / 2;

    if (nums[mid] == target) {
        return mid;
    }
    else if (nums[mid] < target) {
        low = mid + 1;
    }
    else {
        high = mid - 1;
    }
}

return -1;
```

### Key Idea

```
Search Space = Array
```

---

# 4. Binary Search on Answer

Used when the answer is **not directly searched inside the array**.

Instead, we search among all **possible answer values**.

The array itself does not necessarily need to be sorted.

### Example

**Smallest Divisor**

```
nums = [1, 2, 5, 9]
```

Possible divisors:

```
1  2  3  4  5  6  7  8  9
```

Here:

```
Search Space = Possible Answers
```

not the array.

---

# 5. How to Identify Binary Search on Answer?

Follow these steps:

### Step 1 — Identify the Answer

Ask:

> What exactly am I trying to find?

Examples:

* Smallest Divisor → `divisor`
* Koko Eating Bananas → `eating speed`
* Ship Packages → `capacity`
* Aggressive Cows → `minimum distance`

---

### Step 2 — Find the Answer Range

Identify:

```
Minimum Possible Answer
Maximum Possible Answer
```

General rule:

```
low  = minimum possible answer
high = maximum possible answer
```

---

### Step 3 — Take `mid` as a Candidate Answer

mid = candidate answer
```

Ask:

> If `mid` is my answer, is it valid?

---

### Step 4 — Create a Validity Check

The candidate answer should be checkable using a function/logic such as:

isValid(mid)

The result should generally be:

YES / NO

or

Valid / Invalid
```

---

### Step 5 — Check Monotonicity

If the result follows a pattern like:

❌ ❌ ❌ ❌ ✅ ✅ ✅
```

or:

✅ ✅ ✅ ❌ ❌ ❌
```

then the search space is **monotonic**.

This is the key property that allows Binary Search.

---

# 6. Monotonicity

A sequence is monotonic when, after a certain point, the result does not switch back.

### Pattern 1
❌ ❌ ❌ ❌ | ✅ ✅ ✅
```

Once `YES` starts, everything after it is `YES`.

### Pattern 2

✅ ✅ ✅ | ❌ ❌ ❌
```

Once `NO` starts, everything after it is `NO`.

### Why is this important?

Because Binary Search needs to know which half can be safely discarded.

---

# 7. Smallest Valid Answer

Pattern
❌ ❌ ❌ ❌ | ✅ ✅ ✅
             ↑
        Smallest YES
```

Goal:

> Find the **first valid answer**.

### Direction

mid is valid → Go LEFT
mid is invalid → Go RIGHT
```

### Template

```java
int low = minimumAnswer;
int high = maximumAnswer;

while (low <= high) {

    int mid = low + (high - low) / 2;

    if (isValid(mid)) {
        high = mid - 1;
    }
    else {
        low = mid + 1;
    }
}

return low;
```

### Shortcut

Smallest YES → LEFT

# 8. Largest Valid Answer

Pattern:

✅ ✅ ✅ ✅ | ❌ ❌ ❌
         ↑
      Largest YES
```

Goal:

> Find the **last valid answer**.

### Direction
mid is valid → Go RIGHT
mid is invalid → Go LEFT
```

### Template

```java
int low = minimumAnswer;
int high = maximumAnswer;

while (low <= high) {

    int mid = low + (high - low) / 2;

    if (isValid(mid)) {
        low = mid + 1;
    }
    else {
        high = mid - 1;
    }
}

return high;
```
### Shortcut
Largest YES → RIGHT

# 9. `low` and `high` Identification

The most important rule:
low  = Minimum Possible Answer
high = Maximum Possible Answer
```

### Examples

#### Smallest Divisor

low = 1;
high = max(nums);

#### Koko Eating Bananas
low = 1;
high = max(piles);

#### Ship Packages

low = max(weights);
high = sum(weights);
#### Aggressive Cows

low  = minimum possible distance
high = maximum possible distance

# 10. Important Question Signals

These words often indicate **Binary Search on Answer**:

### Minimum / Smallest

* minimum capacity
* minimum speed
* minimum time
* minimum divisor
* minimum distance
* smallest possible value

### Maximum / Largest

* maximum possible value
* largest possible answer
* maximum minimum distance

### Feasibility

* Can we...?
* Is it possible?
* Can we finish within K days?
* Can we allocate...?
* Can we ship...?
* At most?
* At least?
* Within a given limit?

> These words are **signals, not guarantees**.
> Always verify monotonicity.

---

# 11. Important Examples

| Problem                       | Answer/Search Space | Goal                              |
| ----------------------------- | ------------------- | --------------------------------- |
| Binary Search                 | Array               | Find target                       |
| Smallest Divisor              | Divisor range       | Smallest valid divisor            |
| Koko Eating Bananas           | Speed range         | Minimum valid speed               |
| Ship Packages                 | Capacity range      | Minimum valid capacity            |
| Allocate Books                | Maximum pages range | Minimum possible maximum          |
| Split Array Largest Sum       | Maximum sum range   | Minimum possible maximum          |
| Aggressive Cows               | Distance range      | Maximum possible minimum distance |
| Minimum Days to Make Bouquets | Days range          | Minimum valid days                |

---

# 12. Normal Binary Search vs Binary Search on Answer

| Feature       | Normal Binary Search  | Binary Search on Answer |
| ------------- | --------------------- | ----------------------- |
| Search Space  | Array                 | Possible answers        |
| Array Sorted? | Usually required      | Not required            |
| `low`         | `0`                   | Minimum answer          |
| `high`        | `n - 1`               | Maximum answer          |
| `mid`         | Array index           | Candidate answer        |
| Check         | `nums[mid]` vs target | `isValid(mid)`          |
| Main Property | Ordered array         | Monotonic feasibility   |
| Typical Goal  | Find target           | Min/Max valid answer    |

# 13. Complexity of Binary Search on Answer

Suppose:
Number of possible answers = M

Binary Search takes:

O(log M)

If checking one candidate takes:

O(N)
Then total complexity:

O(N log M)

### Example: Smallest Divisor

One validity check = O(N)
Binary Search = O(log(max(nums)))

Total = O(N log(max(nums)))
# 14. Common Mistakes

### Mistake 1 — Assuming Binary Search requires a sorted array

Not always true.

For **Binary Search on Answer**, the array itself can be unsorted.

The **answer space must have an exploitable monotonic property**.

---

### Mistake 2 — Using `low = 0` when answer cannot be zero

Example:

low = 0;

for Smallest Divisor is wrong.

Because:

mid = 0

can lead to:

num / mid

which causes:

ArithmeticException: / by zero
Use:
low = 1;
### Mistake 3 — Thinking Minimum/Maximum automatically means Binary Search

Wrong.

You need:
Possible Answer Range
        +
Candidate Validation
        +
Monotonic YES/no

### Mistake 4 — Confusing the search direction
Smallest YES → YES means LEFT
Largest YES  → YES means RIGHT

### Mistake 5 — Thinking `mid` is automatically the answer

In Binary Search on Answer:
mid = Candidate Answer
Then:
Candidate
    ↓
Validation
    ↓
Valid / Invalid
    ↓
Choose Left / Right

# 15. Safe Mid Formula

Prefer:
int mid = low + (high - low) / 2;
instead of:
int mid = (low + high) / 2

The first version avoids potential integer overflow.
# 16. Identification Flow
                 QUESTION
                     ↓
          What am I searching?
                     ↓
          ┌──────────┴──────────┐
          ↓                     ↓
     Array Element        Possible Answer
          ↓                     ↓
   Is array ordered?     Can I define a range?
          ↓                     ↓
         YES             Can I check mid?
          ↓                     ↓
    Normal Binary        YES / NO result?
       Search                   ↓
                          Monotonic?
                              ↓
                             YES
                              ↓
                    Binary Search on Answer
```

---

# 17. Quick Revision Checklist
Before applying Binary Search, ask:
1. What am I searching for?

2. What is my search space?

3. Is the search space ordered/monotonic?

4. What is the minimum possible answer?

5. What is the maximum possible answer?

6. Can I treat `mid` as a candidate answer?

7. Can I efficiently check whether `mid` is valid?

8. Does the check produce a monotonic YES/NO pattern?

9. Do I need the smallest valid answer or largest valid answer?

10. If valid:
       → LEFT for smallest
       → RIGHT for largest

# 18. Final Golden Rules
RULE 1:
Binary Search means reducing the search space by half.

RULE 2:
Normal Binary Search → Search inside an ordered array.

RULE 3:
Binary Search on Answer → Search inside a range of possible answers.

RULE 4:
For Answer BS, `mid` is a candidate answer.

RULE 5:
A candidate answer must be testable as Valid/Invalid.

RULE 6:
The Valid/Invalid result should be monotonic.

RULE 7:
Smallest Valid Answer → move LEFT when valid.

RULE 8:
Largest Valid Answer → move RIGHT when valid.

RULE 9:
low = minimum possible answer.

RULE 10:
high = maximum possible answer.

RULE 11:
Do not assume Minimum/Maximum automatically means Binary Search.

RULE 12:
Always identify the SEARCH SPACE first.
## One-Line Mental Model
"Main kis cheez ko search kar raha hoon?"

Array element
    → Normal Binary Search

Possible answer
    → Candidate mid
    → Valid/Invalid check
    → Monotonic?
    → Binary Search on Answer
```

 */

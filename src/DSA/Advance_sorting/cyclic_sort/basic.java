package DSA.Advance_sorting.cyclic_sort;
/*
1. Cyclic Sort ka fundamental idea

Cyclic Sort ka basic assumption:

Array ki values ek continuous range me hain aur har value ka ek
predetermined correct index hai.
Hum comparison/sorting ke basis par elements ko arrange nahi karte.

Hum bolte hain:

"Ye value jis index par honi chahiye,
use directly us index par bhejo."

Isliye naam Cyclic Sort.
yaha jo cases hai unke array ki length n hai or jo range wo actual
values hai
----------------------------------------------------------------------------
Case 1: Values 0 to n-1
Correct index:
int correct = arr[i];
Condition:
if (i != arr[i]) {
    swap(arr, i, arr[i]);
} else {
    i++;
}
Yani:
i == arr[i]  → already correct
i != arr[i]  → swap
-----------------------------------------------------------------------------
Case 2: Values 1 to n
Correct index:
int correct = arr[i] - 1;
Tum directly bhi likh sakte ho:
if (i != arr[i] - 1) {
    swap(arr, i, arr[i] - 1);
} else {
    i++;
}
Yani:
i == arr[i] - 1  → already correct
i != arr[i] - 1  → swap
 */
public class basic {
}

package DSA.Advance_sorting.cyclic_sort;
/*
Time complexity O(n);
array par kab use karenge

given an array -> length n
iske ander number
1 to n, 0 to n, 0 to n-1
in no. me koi duplicate , ya missing no. batao
//
niche ye do range di hui hai dono se question solve kar ke dekho direct array ki
value se reject mat karo .
==============================================================================
1️⃣ Range: 1 to n

Rule: value x → index x - 1

int i = 0;

while (i < arr.length) {

    int correct = arr[i] - 1;

    if (arr[i]-1 != i) {
        swap(arr, i, correct);
    } else {
        i++;
    }
}
-----------------------------------------------------------------------------
2️⃣ Range: 0 to n-1

Rule: value x → index x

int i = 0;

while (i < arr.length) {

    int correct = arr[i];

    if (arr[i] != i) {
        swap(arr, i, correct);
    } else {
        i++;
    }
}
-------------------------------------------------------------------------------
 */
public class basic {
}

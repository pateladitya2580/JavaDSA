package DSA.Prefix_Sum;

public class Basic {
    static void main(String[] args) {

    }
}
/* PREFIX SUM

// Definition:
// Prefix Sum ek technique hai jisme array ke elements ka
// cumulative sum store kiya jata hai.

// Example:
// arr = {2, 4, 1, 5, 3}
// prefix = {2, 6, 7, 12, 15}

// Formula:
// prefix[i] = prefix[i-1] + arr[i]

// Java Code:
int[] arr = {2, 4, 1, 5, 3};
int n = arr.length;

int[] prefix = new int[n];

prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
prefix[i] = prefix[i-1] + arr[i];
        }

// RANGE SUM QUERY

// Kisi bhi range L se R tak ka sum find karne ke liye:

// Formula:
// sum(L, R) = prefix[R] - prefix[L-1]

// Special Case:
// Agar L == 0 hai, toh sum = prefix[R]

// Example:
// arr = {2, 4, 1, 5, 3}
// prefix = {2, 6, 7, 12, 15}

// Find sum from index 1 to 3:
// sum = prefix[3] - prefix[0]
// sum = 12 - 2 = 10

// TIME COMPLEXITY:
// Prefix Sum Creation = O(n)
// Range Sum Query = O(1)
// Space Complexity = O(n)

// USE:
// 1. Multiple range sum queries.
// 2. Subarray sum problems.
// 3. Running sum.
// 4. Pivot Index problems.
*/
//=========================================================================================
/*
// SUFFIX SUM

// Definition:
// Suffix Sum ek technique hai jisme array ke elements ka
// right side se cumulative sum calculate kiya jata hai.

// Example:
// arr = {2, 4, 1, 5, 3}
// suffix = {15, 13, 9, 8, 3}

// Formula:
// suffix[i] = arr[i] + suffix[i+1]

// Java Code:

int[] arr = {2, 4, 1, 5, 3};
int n = arr.length;

int[] suffix = new int[n];

suffix[n-1] = arr[n-1];

for(int i = n-2; i >= 0; i--){
    suffix[i] = arr[i] + suffix[i+1];
}

// SUFFIX SUM ARRAY:
// arr    = {2,  4, 1, 5, 3}
// suffix = {15, 13, 9, 8, 3}

// RANGE SUM QUERY

// Kisi bhi range L se R tak ka sum:

// Formula:
// sum(L, R) = suffix[L] - suffix[R+1]

// Special Case:
// Agar R == n-1 hai, toh sum = suffix[L]

// Example:
// Find sum from index 1 to 3:

// suffix[1] - suffix[4]
// 13 - 3 = 10

// TIME COMPLEXITY:
// Suffix Sum Creation = O(n)
// Range Sum Query = O(1)
// Space Complexity = O(n)

// USE:
// 1. Right to left cumulative sum.
// 2. Range sum queries.
// 3. Array and subarray problems.
// 4. Suffix-based problems.
 */
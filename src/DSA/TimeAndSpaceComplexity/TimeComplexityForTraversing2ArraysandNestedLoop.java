package DSA.TimeAndSpaceComplexity;
/*
Q3.Calculate the time complexity for  traversing 2 arrays of size n and m.

int[] a = new int[n];
int[] b = new int[m];

for (int i = 0; i < n; i++) {
    a[i] = i;
}

for (int i = 0; i < m; i++) {
    b[i] = m - i;
}

Step 1: Analyze each loop

First loop

for (int i = 0; i < n; i++)

Runs n times.

Time Complexity = O(n)
Second loop

for (int i = 0; i < m; i++)

Runs m times.

Time Complexity = O(m)

Step 2: Total Time Complexity

The loops execute one after another (sequentially), not nested.

So,

T(n,m)=O(n)+O(m)

Therefore,

Final Time Complexity = O(n + m)
================================================================================
Q4 : Calculate the time complexity in nested loops.

for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.print("okay");
    }
}

Step 1: Analyze the outer loop

for (int i = 0; i < n; i++)

Runs n times.

Time Complexity = O(n)

Step 2: Analyze the inner loop

for (int j = 0; j < m; j++)

Runs m times for every iteration of the outer loop.

Time Complexity = O(m)

Step 3: Total Time Complexity

Since the loops are nested, we multiply their complexities.

T(n,m)=O(n)×O(m)
Final Time Complexity = O(nm)
==================================================================================================
Q5 : Calculate the time complexity in nested loops.

for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
        System.out.print("okay");
    }
}

Step 1: Analyze the outer loop
for (int i = 0; i < n; i++)
Runs n times.
Time Complexity = O(n)
Step 2: Analyze the inner loop
for (int j = 0; j < i; j++)

The inner loop does not run n times every iteration.

It depends on the value of i.

Value of i	Inner loop runs
0	0 times
1	1 time
2	2 times
3	3 times
...	...
n − 1	n − 1 times
Step 3: Total Operations

Total executions are:

0+1+2+3+⋯+(n−1)

Using the sum formula:

0+1+2+⋯+(n−1)=(n-1)(n-1+1)/2 = n*(n-1)/2
Ignoring constants and lower-order terms:
T(n)=O(n^2)

qustion no.4 me inner loop outer loop se independent hai ,isliye multiple
kar diya but question 5 me inner loop outer loop par dependent hai isliye
hamne aese iteration nikal kar add kiye
 */
public class TimeComplexityForTraversing2ArraysandNestedLoop {
}

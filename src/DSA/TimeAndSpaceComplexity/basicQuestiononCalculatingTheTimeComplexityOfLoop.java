package DSA.TimeAndSpaceComplexity;
/*
Q1. Calculate the time complexity for iterating in a loop.
for (int i = 0; i < n; i++) {
    System.out.println("PhysicsWallah");
}

TimeComplexity =O(n)

Explanation: The loop variable i starts at 0 and runs
as long as i < n, incrementing by 1 in each iteration (i++).
Because the loop executes exactly n times and the print statement
inside takes constant time O(1), the overall time complexity
grows linearly with n.

========================================================================================================================

Q2. Calculate the time complexity.
for (int i = 0; i < n + 3; i++) {
    System.out.println("PhysicsWallah");
}

for (int i = 0; i < n; i += 2) {
    System.out.println("PhysicsWallah");
}

TimeComplexity = O(n)

1.**First Loop:**
* Runs n + 3 times, which simplifies to O(n).


2.**Second Loop:**
* Increments by 2 each time (i += 2), so it runs n/2 times,
which simplifies to O(n).
* **Total Time Complexity:** O(n) + O(n) = O(2n) = O(n) constant ignore

//O(kn) k is constant = O(n)
//0(n+K)= O(n)
//O(n-k) = O(n)
//O(n^3+100n^2-5n) = O(n^3) highest power of n is consider
//If there are other variable like m ,they are separate.
//example => O(n+10m) = O(n+m)
//O(200) time complexity is )=O(1) yadi constant time hai to 1 hoga

========================================================================================================================


 */
public class basicQuestiononCalculatingTheTimeComplexityOfLoop {
}

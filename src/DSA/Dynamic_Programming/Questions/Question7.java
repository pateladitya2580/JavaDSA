package DSA.Dynamic_Programming.Questions;

import java.util.Arrays;
import java.util.Scanner;

//Friends Pairing Problem by ( recursion + Memoization )
/*
you are given a number 'n' .Denoting that there are 'n' friends
find out the no. of way in which a person can either pair up or
stay single.
 */
public class Question7 {
    public static int pair (int n ,int[]dp){
        if(n<=2)return n;
        if(dp[n] !=  -1) return dp[n];
        return dp[n] = pair(n-1,dp)+ (n-1)*pair(n-2,dp);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n,dp));
    }
}
/*

## Friends Pairing Problem – Recurrence Formula

### Final Recurrence Relation

f(n) = f(n-1) + (n-1) * f(n-2)

### Explanation

**1. Case 1: Friend A remains Single**

- Total friends = n
- Friend A remains single.
- So, 1 friend is removed.
- Remaining friends = n-1
- Total ways = f(n-1)

**2. Case 2: Friend A makes a Pair**

- Friend A can pair with any one of the remaining friends.
- Total pairing choices = n-1
- After making a pair, 2 friends are removed.
- Remaining friends = n-2
- Total ways for remaining friends = f(n-2)

Therefore:

Total ways = (n-1) * f(n-2)

### Combining Both Cases

f(n) = f(n-1) + (n-1) * f(n-2)

### Meaning of Each Expression

| Expression | Meaning |
|---|---|
| f(n-1) | Friend A remains single, so 1 friend is removed. |
| n-1 | Number of choices available to Friend A for making a pair. |
| f(n-2) | After making a pair, 2 friends are removed and n-2 friends remain. |

### Base Cases

f(1) = 1
f(2) = 2

### Final Answer

f(n) = f(n-1) + (n-1) * f(n-2)

 */
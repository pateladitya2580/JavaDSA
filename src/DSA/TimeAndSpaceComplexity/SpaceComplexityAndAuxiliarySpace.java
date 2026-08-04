package DSA.TimeAndSpaceComplexity;
/*
*Space Complexity

*Definition:

*Space Complexity batati hai ki algorithm execute hone ke liye total kitni
 memory (space) use hoti hai as input size n increase hota hai.

*Auxiliary Space

*Definition:

*Algorithm ke execution ke dauran input ke alawa jo extra memory use hoti
 hai, use Auxiliary Space kehte hain.

=============================================================================
Q8 : Calculate the time and space complexity for the below code snippet.

int[] a = new int[n];

for (int i = 0; i < n; i++) {
    a[i]++;
}
Time Complexity O(n)
Space Complexity O(n)

=============================================================================
Q9 : What will be the space complexity if we just traverse without creating
    any array?
int c = 0;
for(int i = 0; i < n; i++) {
    c++;
}
Time Complexity O(n)
Space Complexity O(1) yaha ham ne koi space kharch nahi kia hai isliye 1 hai
int[]a = new int[10] isme bhi space complexity 1 hogi

===============================================================================
Q10 : Calculate the space complexity for the below nested loop code snippet.

ArrayList<Integer> a = new ArrayList<>();
ArrayList<Integer> b = new ArrayList<>();
for (int i = 0; i < n; i++) { yaha ek ek kar ke element add kia isliye TC n aai
    a.add(1);
}
for (int i = 0; i < m; i++) {yaha ek ek kar ke element add kia isliye TC m aai
    b.add(1);
}

Time Complexity O(n+m)
Space Complexity O(n+m)

==============================================================================
# SPACE COMPLEXITY OF CREATING A 2D ARRAY
Q11 : What will be the space complexity if we create 3 arrays of the same
      size?
int[] a = new int[n];//yaha TC 1 hai kyo ki one go me pura declare ho raha hai
int[] b = new int[n];
int[] c = new int[n];
for (int i = 0; i < n; i++) {
    c[i]++;
}
Time Complexity O(n)
Space Complexity O(n+n+n)= O(3n) roughly O(n)
*
 */
public class SpaceComplexityAndAuxiliarySpace {
}

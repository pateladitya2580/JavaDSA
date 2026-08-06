package DSA.TimeAndSpaceComplexity;
/*
Q12: Calculate the time complexity for the following code snippet.

int c = 0;
for (int i = 1; i < n; i += i) {
    c++;
}

Time Complexity = O(log n)
=======================================================================================================================
Q13 : Calculate the time complexity for the following code snippet.

int c = 0;
for(int i = 1; i < n; i += i) {// i+=i equal to i*=2,yaha han < ki jaga <= bhi maan sakte hai itna koi effect nahi hota
    for(int j = 0; j < i; j++) {
        c++;
    }
}

Analyze the Inner Loop
for(int j = 0; j < i; j++)

The inner loop runs i times for each value of i.

Outer Loop (i)	Inner Loop Runs
1	            1
2	            2
4	            4
8	            8
16	            16
...             ...

M-I(2^x approx = n)

S = 1 + 2 + 4 + 8 + ... + 2^x

= 1 * ((2^(x+1) - 1) / (2 - 1)) = 2^(x+1) - 1 = 2 * 2^x - 1

= 2n - 1

T.C. = O(n)

a, ar, ar^2, ... ar^(n-1)

n

S = a * ((r^n - 1) / (r - 1))
aesa jab karte hai jab inner loop outer loop par depend karta hai
Time Complexity = O(n)
========================================================================================================================
Q14: Calculate the time complexity for the following code snippet.

int c = 0;
for (int i = 1; i < n; i += i) {
    for (int j = n; j >= 0; j--) {
        c++;
    }
}
inner loop outer loop par depend nahi kar raha hai isliye direct multiple
karenge .

outer loop log n time chal raha hai
inner loop roughly n time chal raha hai
TC = O(n*log n)
========================================================================================================================
Q15 Calculate the time complexity for the following code snippet.

int c = 0;
for(int i = 1; i * i < n; i *= 2) {
    for(int j = 0; j < i; j++) {
        c++;
    }
}
Time Complexity = O(√n)
========================================================================================================================
Q16  Calculate the time complexity for the following code snippet.

int c = 0;
for(int i = 2; i < n; i *= i) {
    c++;
}
TC = O(log.log n)
========================================================================================================================
Q17  Calculate the time complexity for the following code snippet.

int c = 0;
for(int i = 2; i * i < n; i *= i) {
    c++;
}
TC = O(log(log root n))
 */
public class PracticeQuestionsBasedOnTimeComplexity {
}

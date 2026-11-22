package DSA.Sliding_Windows.Question;
//LeetCode 1248. Count Number of Nice Subarrays
public class Question8 {

    class Solution {
        public int numberOfSubarrays(int[] arr, int k) {

            int i = 0, j = 0;
            int a = 0, b = 0;
            int n = arr.length;
            int k2 = 0;

        /*
         APPROACH:
         Exactly k odd numbers wale subarrays count karne hain.

         i = First odd number ka index
         j = Kth odd number ka index
         a = Left side ki starting boundary
         b = Right side ki ending boundary

         Formula:
         Valid subarrays =
         (Left choices) * (Right choices)

         Left choices  = i - a + 1
         Right choices = b - j + 1
        */

            // STEP 1: First odd number find karo.
            // Even elements ko skip karte hue i ko aage badhao.
            // Loop odd number milte hi rukta hai,
            // isliye yahan i-- ki zarurat nahi hai.

            while (i < n && arr[i] % 2 == 0) {
                i++;
            }

            // STEP 2: Kth odd number find karo.
            // j har iteration mein aage badhega.
            // k odd numbers milne ke baad loop stop hoga.

            while (j < n && k2 < k) {

                if (arr[j] % 2 != 0) {
                    k2++;
                }

                j++;
            }

            // Agar array mein k odd numbers nahi mile,
            // toh exactly k odd numbers wala subarray possible nahi hai.

            if (k2 < k) return 0;

            // j ek position aage chala gaya hai,
            // kyunki loop ke andar j++ execute hua tha.
            // Isliye actual Kth odd index par wapas lao.

            j--;

            // STEP 3: Kth odd ke baad last even element find karo.
            // b ko j+1 se start karenge.
            // Next odd tak move karenge.

            b = j + 1;

            while (b < n && arr[b] % 2 == 0) {
                b++;
            }

            // b ab next odd par hai (ya n par).
            // Humein next odd nahi chahiye.
            // Humein usse pehle wale last even ka index chahiye.
            // Isliye b-- karenge.

            b--;

            int count = 0;

            // STEP 4: Main counting loop.
            // Jab tak b array ke andar hai,
            // current group ke valid subarrays count karte raho.

            while (b < n) {

            /*
             LEFT CHOICES:
             First odd index i hai.
             Usse pehle a se i tak possible starting positions hain.

             RIGHT CHOICES:
             Kth odd index j hai.
             Uske baad j se b tak possible ending positions hain.

             Dono choices independently select ho sakti hain,
             isliye multiply karenge.
            */

                count += (i - a + 1) * (b - j + 1);

                // STEP 5: Next group ke liye left boundary update.
                // Current first odd ke baad se next starting positions hongi.

                a = i + 1;

                // Current odd ko cross karke next odd find karo.
                i++;

                // Even elements skip karke next odd par pahucho.
                // Odd milte hi loop rukta hai,
                // isliye yahan i-- nahi karna.

                while (i < n && arr[i] % 2 == 0) {
                    i++;
                }

                // STEP 6: Next group ka Kth odd find karo.
                // Previous right boundary ke baad se search start hogi.

                j = b + 1;

                // STEP 7: Next Kth odd ke baad last even find karo.

                b = j + 1;

                while (b < n && arr[b] % 2 == 0) {
                    b++;
                }

                // b next odd par pahunch gaya (ya n par).
                // Humein usse pehle wale last even par rukna hai.
                // Isliye b-- zaroori hai.

                b--;
            }

            // Sabhi valid subarrays ki total count return karo.
            return count;
        }
    }

    static void main(String[] args) {

    }
}

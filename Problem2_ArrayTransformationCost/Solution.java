import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        // Step 1: Check feasibility
        int mod = A[0] % K;
        for (int i = 1; i < n; i++) {
            if (A[i] % K != mod) {
                System.out.println(-1);
                return;
            }
        }

        // Step 2: Convert to B[i] = A[i] / K
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = A[i] / K;
        }

        // Step 3: Sort and find median
        Arrays.sort(B);
        int median = B[n / 2];

        // Step 4: Calculate operations
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += Math.abs(B[i] - median);
        }

        System.out.println(operations);
    }
}

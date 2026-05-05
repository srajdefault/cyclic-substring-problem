Problem1_CyclicSubstringMaxSum/Solution.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int left = 0;
        int currentSum = 0;
        int maxSum = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < 2 * n; right++) {
            char ch = s.charAt(right % n);

            // shrink window if duplicate or size > n
            while (set.contains(ch) || (right - left + 1) > n) {
                char leftChar = s.charAt(left % n);
                set.remove(leftChar);
                currentSum -= (leftChar - 'a' + 1);
                left++;
            }

            // add current character
            set.add(ch);
            currentSum += (ch - 'a' + 1);

            // update max sum
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}

import java.util.*;

public class Pallindromic_string {
    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        // Expand around each center
        for (int i = 0; i < n; i++) {
            count += expandAroundCenter(s, i, i); // odd length
            count += expandAroundCenter(s, i, i + 1); // even length
        }

        return count;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aaa";
        System.out.println(countSubstrings(str));
        sc.close();
    }
}

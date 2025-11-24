import java.util.*;

public class lomgest_Substring_wt_RPT_CHAR {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            while (hs.contains(s.charAt(j))) {
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(s.charAt(j));
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
        sc.close();
    }
}

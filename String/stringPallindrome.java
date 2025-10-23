public class stringPallindrome {
    public static boolean checkPallindrome(String str) {
        if (str.equals(reverse(str)))
            return true;
        return false;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noonn";
        System.out.println(checkPallindrome(str));
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }
}

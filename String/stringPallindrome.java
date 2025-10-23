public class stringPallindrome {
    public static boolean checkPallindrome(String str) {
        if (str.equals(reverse(str)))
            return true;
        return false;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "noonn";
        System.out.println(checkPallindrome(str));
    }
}

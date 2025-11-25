import java.util.*;

public class rotate_String {
    public static boolean rotate_String_(String s, String t) {
        StringBuilder sb = new StringBuilder();
        sb.append(s + s);
        if (s.length() == t.length()) {
            if (sb.toString().contains(t)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "cde", t = "dec";
        System.out.println(rotate_String_(s, t));
        sc.close();
    }
}

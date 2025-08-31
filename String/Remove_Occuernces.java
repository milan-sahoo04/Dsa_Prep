import java.util.*;

public class Remove_Occuernces {
    public static String remove_occurence(String s, String part) {
        int n = s.length();
        int m = part.length();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            if (sb.length() >= m) {
                String sub = sb.substring(sb.length() - m);
                if (sub.equals(part)) {
                    sb.setLength(sb.length() - m);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc", part = "abc";
        System.out.println(remove_occurence(s, part));
    }
}

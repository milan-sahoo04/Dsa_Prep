import java.util.*;

public class Lngest_prefix {
    public static String longestPrefix(String str[]) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] end = str[str.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != end[i])
                break;
            sb.append(first[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = { "flower", "flow", "flight" };
        System.out.println(longestPrefix(str));
        sc.close();
    }
}

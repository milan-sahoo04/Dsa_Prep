public class reverseWords {

    public static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder();
        String[] s = str.trim().split("\\s+");

        for (int i = s.length - 1; i >= 0; i--) {

            sb.append(s[i]);
            if (i != 0)
                sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Milan 7  Sahoo";
        System.out.println(reverseWord(str));
    }
}

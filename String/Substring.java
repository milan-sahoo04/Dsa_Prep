import java.util.*;

class Substring {
    public static String subString(String S, int s, int e) {
        return S.substring(s, e);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(subString(S, start, end));

        // System.out.println("Helllo World");
        in.close();
    }
}

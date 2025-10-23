import java.util.*;

class removeOuterParanthesis {

    public static String removeOuter(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (count > 0)
                    sb.append(str.charAt(i));
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
                if (count > 0)
                    sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "((a+b))((()))";
        System.out.println(removeOuter(str));
    }
}
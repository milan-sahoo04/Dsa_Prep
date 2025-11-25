import java.util.HashMap;
import java.util.*;

public class isometric_String {
    public static boolean isomerphic_String(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (mapST.containsKey(sChar)) {
                if (mapST.get(sChar) != tChar) {
                    return false;
                }
            } else {
                mapST.put(sChar, tChar);
            }

            if (mapTS.containsKey(tChar)) {
                if (mapTS.get(tChar) != sChar)
                    return false;
            } else {
                mapTS.put(tChar, sChar);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "foo", t = "bar";
        System.out.println(isomerphic_String(s, t));
        sc.close();
    }
}

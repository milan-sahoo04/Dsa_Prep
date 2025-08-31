import java.util.*;

public class ValidAnagram {
    public static boolean validAna(String str1, String str2) {
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        int counts[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            counts[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            counts[str2.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "raac";

        System.out.println(validAna(str1, str2));
    }
}

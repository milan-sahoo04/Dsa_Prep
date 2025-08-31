import java.util.*;

public class Increasing_triplet12 {
    public static boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= min1) {
                min1 = n; // smallest so far
            } else if (n <= min2) {
                min2 = n; // second smallest
            } else {
                // found n > min2 > min1
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 0, 4, 6 };
        System.out.println(increasingTriplet(arr));
    }
}

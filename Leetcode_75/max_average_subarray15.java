import java.util.*;

public class max_average_subarray15 {
    public static double max_subarray_avg(int nums[], int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        int start = 0, end = k;
        while (end < n) {
            sum -= nums[start];
            start++;
            sum += nums[end];
            end++;
            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(max_subarray_avg(nums, k));
    }
}

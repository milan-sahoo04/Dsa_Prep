import java.util.*;

public class Two_sum {

    // BRUTE
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] {};
    }

    // Better
    public static int[] two_sum_hmp(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hmp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int need = target - num;
            if (hmp.containsKey(need)) {
                ans[0] = hmp.get(need); // index of the required number
                ans[1] = i; // current index
                return ans;
            }
            hmp.put(num, i);
        }

        return new int[] {};
    }

    // Optimal
    public static String two_sum_T20_pntr(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n - 1;
        for (int i = 0; i < n; i++) {
            int sum = nums[left] + nums[right];
            if (sum == target)
                return "Yes";
            else if (sum < target)
                left++;
            else
                right--;
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        // System.out.println(twoSum(arr, target));
        // System.out.println(two_sum_hmp(arr, target));
        System.out.println(two_sum_T20_pntr(arr, target));
        sc.close();
    }
}
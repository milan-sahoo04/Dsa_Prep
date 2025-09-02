import java.util.*;

class Max_Of_kSums {
    public static int max_k_sum(int nums[], int k) {
        Arrays.sort(nums);
        int s = 0, e = nums.length - 1, count = 0;
        while (s < e) {
            int sum = nums[s] + nums[e];
            if (sum == k) {
                count++;
                s++;
                e--;
            } else if (sum < k) {
                s++;
            } else
                e--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = { 1, 2, 3, 4, 6, 3, 5 };
        int k = 6;
        System.out.println(max_k_sum(nums, k));
        sc.close();
    }
}
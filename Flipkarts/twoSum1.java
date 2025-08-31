import java.util.*;

public class twoSum1 {

    public static int[] t2_sum(int arr[], int target) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static int[] two_hash_sum(int arr[], int target) {
        int n = arr.length;
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreneed = target - num;
            if (map.containsKey(moreneed)) {
                ans[0] = map.get(moreneed);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }

    public static String t2_sum_optimal(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target)
                return "Yes";
            else if (sum < target)
                l++;
            else
                r--;
        }
        return "No";
    }

    public static int solve(String str) {
        int maxLen = Integer.MIN_VALUE;
        if (str.length() == 0)
            return 0;
        for (int i = 0; i < str.length(); i++) {
            Set<Character> st = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                if (st.contains(str.charAt(j))) {
                    maxLen = Math.max(maxLen, j - i);
                    break;
                }
                st.add(str.charAt(j));
            }
        }
        return maxLen;
    }

    public static int better_solve(String str) {
        int maxLen = Integer.MIN_VALUE;
        if (str.length() == 0)
            return 0;
        int l = 0;
        Set<Character> map = new HashSet<>();
        for (int r = 0; r < str.length(); r++) {
            if (map.contains(str.charAt(r))) {
                while (l < r && map.contains(str.charAt(r))) {
                    map.remove(str.charAt(l));
                    l++;
                }
            }
            map.add(str.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;

    }

    public static int optimal_solve(String str) {
        int n = str.length();
        int l = 0, r = 0;
        int maxLen = Integer.MIN_VALUE;
        if (n == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < n) {
            if (map.containsKey(str.charAt(r)))
                l = Math.max(map.get(str.charAt(r)) + 1, l);

            map.put(str.charAt(r), r);
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }

    public static void rotate_d(int arr[], int d) {
        int n = arr.length;
        int k = d % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }

    public static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void optimal_rotate(int arr[], int d) {
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static int equilibrium(int arr[]) {
        int n = arr.length;
        int sum = 0, leftSum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (sum == leftSum)
                return i;
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1
        // int arr[] = { 2, 6, 5, 8, 1 };
        // System.out.println("Enter target");
        // int target = sc.nextInt();
        // int ans[] = t2_sum(arr, target);
        // int ans[] = two_hash_sum(arr, target);

        // System.out.println(ans[0] + " " + ans[1]);
        // System.out.println(t2_sum_optimal(arr, target));

        // 2
        // String str = "aca";
        // System.out.println("The length of the longest without repeating characters is
        // " + solve(str));
        // System.out.println("The length of the longest without repeating characters is
        // " + better_solve(str));
        // System.out.println("The length of the longest without repeating characters is
        // " + optimal_solve(str));

        // 3
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // System.out.println("Enter d : ");
        // int d = sc.nextInt();
        // // rotate_d(arr, d);
        // optimal_rotate(arr, d);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // 4 find pivot index or equilibrium
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(equilibrium(arr));
        sc.close();
    }
}

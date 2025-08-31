import java.util.*;

class Container_with_MostWtr13 {
    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (l < r) {
            int curr = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(max, curr);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Max Water is : " + maxArea(arr));
        sc.close();
    }
}

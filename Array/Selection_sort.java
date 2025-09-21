import java.util.Scanner;

public class Selection_sort {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min])
                    min = j;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Selection_sort sorter = new Selection_sort();
        int sorted[] = sorter.selectionSort(nums);
        System.out.println("Sorted array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

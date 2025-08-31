import java.util.*;

public class find_diplicate {
    public static int find_dupli(int[] arr) {
        Set<Integer> st = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (!st.add(arr[i]))
                return arr[i];
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 2, 2 };
        System.out.println(find_dupli(arr));
        sc.close();
    }
}
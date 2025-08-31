import java.util.*;

public class Max_min_in_array {

    public static void max_min(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("Maximum is : " + arr[n - 1]);
        System.out.println("Minimum is : " + arr[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        max_min(arr);

        sc.close();
    }
}

import java.util.*;

class move_zeros_end {
    public static void moveZeros(int n, int arr[]) {
        n = arr.length;
        int temp[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[k++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void moveZeros_optimal(int n, int arr[]) {
        int j = 0;
        n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = 10;
        // moveZeros(n, arr);
        moveZeros_optimal(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        sc.close();
    }
}
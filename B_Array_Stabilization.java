import java.util.Arrays;
import java.util.Scanner;

public class B_Array_Stabilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting makes finding 1st/2nd max and min trivial
        Arrays.sort(arr);

        // Case 1: Remove the absolute maximum (arr[n-1])
        // New Max is arr[n-2], Min is arr[0]
        int option1 = arr[n - 2] - arr[0];

        // Case 2: Remove the absolute minimum (arr[0])
        // Max is arr[n-1], New Min is arr[1]
        int option2 = arr[n - 1] - arr[1];

        System.out.println(Math.min(option1, option2));
        
        sc.close();
    }
}
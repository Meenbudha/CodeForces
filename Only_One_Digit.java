import java.util.Scanner;

public class Only_One_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // number of test cases
        while (t-- > 0) {
            int x = scanner.nextInt();

            // Create an array to mark the digits present in x
            int[] digitPresent = new int[10];  // digitPresent[0] to digitPresent[9]

            int temp = x;
            while (temp > 0) {
                int digit = temp % 10;
                digitPresent[digit] = 1;
                temp /= 10;
            }

            // Find the smallest digit y from 0 to 9 that is present in x
            for (int y = 0; y <= 9; y++) {
                if (digitPresent[y] == 1) {
                    System.out.println(y);
                    break;
                }
            }
        }

        scanner.close();
    }
}

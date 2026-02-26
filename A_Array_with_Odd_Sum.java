
import java.util.Scanner;

public class A_Array_with_Odd_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int sum = 0;
            boolean hasEven = false;
            boolean hasOdd = false;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                sum += val;
                if(val% 2 != 0) hasOdd = true;
                if(val% 2 == 0) hasEven = true;
            }
            if(sum % 2 != 0){
                System.out.println("YES");
            } else if(hasOdd && hasEven) {
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

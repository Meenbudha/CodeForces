import java.util.*;

public class A_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [][] arr = new int[n][n];
            for(int i = 0; i < n; i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = i;
            }
            Arrays.sort(arr, (a, b) -> a[0]- b[0]);
            boolean possible = true;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i][1] % 2 == arr[i-1][1] % 2){
                    possible = false;
                    break;
                }
            }
            if(possible){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

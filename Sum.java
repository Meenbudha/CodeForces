import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        int t = obj.nextInt();
        while(t-- > 0){
            int a, b, c;
            a = obj.nextInt();
            b = obj.nextInt();
            c = obj.nextInt();
            if(a+b == c || a+c == b||b+c== a){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        obj.close();

    }
}
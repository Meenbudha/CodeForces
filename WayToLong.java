import java.util.*;

public class WayToLong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            String s = sc.next();
            int len = s.length();
            if(len <= 10) {
                System.out.println(s);
            }else{
                System.out.println(s.charAt(0) +""+ (len-2) + s.charAt(len-1));
            }
        }       
    }
}
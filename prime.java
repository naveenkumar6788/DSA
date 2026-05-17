
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner java=new Scanner(System.in);
        int num=java.nextInt();
        boolean ans=isprime(num);
        System.out.println(ans);
        
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}

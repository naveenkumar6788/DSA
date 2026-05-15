
import java.util.Scanner;

public class nth_occurance {
    public static void main(String[] args) {
        Scanner java=new Scanner(System.in);
        int c=0;
        int n=java.nextInt();
        while(n!=0){
            int rem=n%10;
            if(rem==4){
                c++;
            }
            n/=10;
        }
        System.out.println(c);
    }

}

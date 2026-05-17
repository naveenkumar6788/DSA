import java.util.Scanner;

public class armstrong{
    public static void main(String Args[]){
        Scanner java=new Scanner(System.in);
        int n=java.nextInt();
        System.out.println(arms(n));
         // loop 
        for(int i=100;i<1000;i++){
            if(arms(i)){
                System.out.print(i+ " ");
            }
        }
    }
    static boolean arms(int n){
        int temp=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==temp;
    }
}

public class fib_recursion {
    public static void main(String[] args) {
        int ans=fibbo(9);
        System.out.println(ans);
    }
    static int fibbo(int n){
        if(n<2){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
}

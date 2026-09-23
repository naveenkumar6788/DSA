public class fac_rec {
    public static void main(String[] args) {
        int ans=fac(-1);
        System.out.println(ans);
    }
    static int fac(int n){
        if(n<=1){
            return 1;
        }
        return n+fac(n-1);
    }
}
public class swap {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int res[]=swap(x,y);
        System.out.println(res[0] + " " +res[1]);
    }
    static int[] swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }  
}

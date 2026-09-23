public class missing_number{
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 5};
        // int sum=0;
        int n=arr.length;
        // int expect=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            // sum+=arr[i];
            n=n^i^arr[i];
        }
        // int missing=sum-expect;
        // System.err.println(missing);
        System.out.println(n);
    }
}
import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner java =  new Scanner(System.in); 
        int r=java.nextInt();
        int c=java.nextInt();
        int[][] arr= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=java.nextInt();
            }
        } 
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
         System.out.print(sum);
    }
}
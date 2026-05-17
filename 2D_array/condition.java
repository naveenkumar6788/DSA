
import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner java=new Scanner(System.in);
        int r=java.nextInt();
        int c=java.nextInt();
        int arr[][]=new int[r][c];
        int arr1[][]=new int[r][c];
        int res[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=java.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=java.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==arr1[i][j]){
                    res[i][j]=1;
                }
                else{
                    res[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

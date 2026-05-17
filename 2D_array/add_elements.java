
import java.util.*;

public class add_elements {
    public static void main(String[] args) {
        Scanner java=new Scanner(System.in);
        int r=java.nextInt();
        int c=java.nextInt();
        int arr[][]=new int[r][c];
        int arr1[][]=new int[r][c];
        int sum[][]=new int[r][c];
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
        
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((sum[i][j] = arr[i][j] + arr1[i][j]) + " ");
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner java=new Scanner(System.in);
        int r=java.nextInt();
        int c=java.nextInt();
        int arr[][]=new int[r][c];
        int arr1[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=java.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class matrixsub {
    public static void main(String[] args) {
        int m,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows and columns of a matrix: ");
        m=s.nextInt();
        n=s.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int dif[][]=new int[m][n];
        System.out.println("Enter 1st matrix elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter 2st matrix elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dif[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("dif of the 2 matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(dif[i][j]+" ");
            }
            System.out.println();
        }
    }
}

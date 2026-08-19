import java.util.*;
public class matrixtrans {
    public static void main(String[] args) {
        int m,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows and columns of a matrix: ");
        m=s.nextInt();
        n=s.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter matrix elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Transpose of the a matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class matrixmul {
    public static void main(String[] args) {
        int m1,n1,m2,n2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows and columns of 1st matrix: ");
        m1=s.nextInt();
        n1=s.nextInt();
        System.out.println("Enter rows and columns of 2st matrix: ");
        m2=s.nextInt();
        n2=s.nextInt();
        int a[][]=new int[m1][n1];
        int b[][]=new int[m2][n2];
        int mul[][]=new int[m1][n2];
        System.out.println("Enter 1st matrix elements: ");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter 2st matrix elements: ");
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                mul[i][j]=0;
                for(int k=0;k<n1;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Mul of the 2 matrix is: ");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}

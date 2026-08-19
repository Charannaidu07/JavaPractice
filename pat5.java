public class pat5 {
    public static void main(String[] args) {
        int i,j,n=5,b;
        for(i=1;i<=n;i++)
        {
            for(b=1;b<=n-i;b++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

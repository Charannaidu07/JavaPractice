public class pat3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <n-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

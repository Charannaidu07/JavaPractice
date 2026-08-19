public class multithrad {
    public static void main(String[] args) {
        System.out.println("In multi Thread: \n");
        mainpro m1=new mainpro("CHARAN",10);
        Thread t1=new Thread(m1);
        mainpro m2=new mainpro("SREENU",10);
        Thread t2=new Thread(m2);
        t1.start();
        t2.start();
    }
}

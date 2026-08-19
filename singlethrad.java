public class singlethrad {
    public static void main(String[] args) {
        System.out.println("In Single Thread: \n");
        mainpro m=new mainpro("CHARAN",10);
        Thread t1=new Thread(m);
        //m.run();
        t1.start();
    }
}

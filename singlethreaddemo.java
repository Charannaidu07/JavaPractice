public class singlethreaddemo{
    public static void main(String args[]){
        System.out.println("Single-threaded execution:"); 
        printer printing=new printer("hii",10);
        printing.run();
    }
}
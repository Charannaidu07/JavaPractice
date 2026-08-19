public class multithreaddemo{
    public static void main(String args[]){
        System.out.println("Multi-threaded execution:"); 
        printer printer1 = new printer("Thread-1", 5); 
        printer printer2 = new printer("Thread-2", 5); 
        Thread thread1 = new Thread(printer1); 
        Thread thread2 = new Thread(printer2); 
        thread1.start();  
        thread2.start();} 
    }
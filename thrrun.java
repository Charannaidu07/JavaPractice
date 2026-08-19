class A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class thrrun {
    public static void main(String[] args) {
        A o1=new A();
        B o2=new B();
        Thread t1=new Thread(o1);
        Thread t2=new Thread(o2);
        t1.start();
        t2.start();
    }
}

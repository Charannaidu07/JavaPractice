class A extends Thread{
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
class B extends Thread{
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
public class thrrrr {
    public static void main(String[] args) {
        A o1=new A();
        B o2=new B();
        o1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        o2.start();
    }
}

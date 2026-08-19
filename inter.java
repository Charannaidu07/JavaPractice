interface A{
    void show();
    void config();
}
class B implements A{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
}
public class inter {
    public static void main(String[] args) {
        A obj=new B();
        obj.config();
        obj.show();
    }
}

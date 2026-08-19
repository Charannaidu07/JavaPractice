import shapes.*;
public class apmain {
    public static void main(String[] args) {
        try {
            Shape circle=new shapes.circle(5);
            Shape rectangle=new rectangle(2,3);
            System.out.println("Circle: \nArea: "+circle.area()+"\n"+"Perimeter: "+circle.perimeter()+"\nrectangle: \nArea: "+rectangle.area()+"\n"+"Perimeter: "+rectangle.perimeter());
        } catch (Exception e) {
            System.out.println("Invalid!!!");
        }
    }
}

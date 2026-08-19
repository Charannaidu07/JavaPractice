class shapecalc{
    public int area(int side){
        return side*side;
    }
    public int area(int length,int breadth){
        return length*breadth;
    }
    public double area(double radius){
        return 3.14*radius*radius;
    }
    public double area(double base,double height){
        return base*height*0.5;
    }
}
public class calcc {
    public static void main(String[] args) {
        shapecalc ob=new shapecalc();
        System.out.println("Area of sqr: "+ob.area(4)+"\nArea of rec: "+ob.area(4,5)+"\nArea of cir: "+ob.area(5.8)+"\nArea of tri: "+ob.area(2.5,2.5));
    }
}
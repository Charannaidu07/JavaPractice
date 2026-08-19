import java.awt.*;
import java.awt.event.*;
class web{
    web(){
        Frame fm=new Frame();
        Label lb = new Label("Hi");
        lb.setBounds(40, 100, 100, 30);
        TextField tf = new TextField();
        tf.setBounds(200, 100, 100, 30);
        fm.add(lb);
        fm.add(tf);
        fm.setSize(300, 300);    
        fm.setVisible(true) ;          
    }
    public static void main(String args[])  
    { 
        web ta = new web();  
    } 
}
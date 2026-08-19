import java.awt.*;  
import java.awt.event.*; 

class simplecalculator implements ActionListener {  
    Frame f1 = new Frame();  
    Label l1 = new Label("First Number");  
    Label l2 = new Label("Second Number");  
    Label l3 = new Label("Result"); 
    TextField t1 = new TextField();  
    TextField t2 = new TextField();  
    TextField t3 = new TextField();  
    Button b1 = new Button("Add+"); 
    Button b2 = new Button("Sub-"); 
    Button b3 = new Button("Mul*"); 
    Button b4 = new Button("Div/"); 
    Button b5 = new Button("Cancel"); 

    simplecalculator() {  
        // Setting component bounds
        l1.setBounds(40, 100, 100, 15);  
        l2.setBounds(40, 140, 100, 15); 
        l3.setBounds(40, 180, 100, 15);  
        t1.setBounds(200, 100, 100, 15);  
        t2.setBounds(200, 140, 100, 15);  
        t3.setBounds(200, 180, 100, 15);  
        b1.setBounds(50, 250, 45, 15);  
        b2.setBounds(110, 250, 45, 15);  
        b3.setBounds(170, 250, 45, 15);  
        b4.setBounds(230, 250, 45, 15);  
        b5.setBounds(290, 250, 45, 15);  

        // Adding components to the frame  
        f1.add(l1);  
        f1.add(l2);  
        f1.add(l3);  
        f1.add(t1);  
        f1.add(t2);  
        f1.add(t3);  
        f1.add(b1);  
        f1.add(b2);  
        f1.add(b3);  
        f1.add(b4);  
        f1.add(b5);  

        // Adding action listeners
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        b4.addActionListener(this);  
        b5.addActionListener(this);  

        f1.setLayout(null);  
        f1.setVisible(true);  
        f1.setSize(400, 350);  
    } 

    public void actionPerformed(ActionEvent e) { 
        int n1 = Integer.parseInt(t1.getText());  
        int n2 = Integer.parseInt(t2.getText());  
        
        if (e.getSource() == b1) { 
            t3.setText(String.valueOf(n1 + n2));  
        } 
        if (e.getSource() == b2) { 
            t3.setText(String.valueOf(n1 - n2)); 
        }  
        if (e.getSource() == b3) { 
            t3.setText(String.valueOf(n1 * n2)); 
        }  
        if (e.getSource() == b4) { 
            if (n2 != 0) {
                t3.setText(String.valueOf(n1 / n2)); 
            } else {
                t3.setText("Cannot divide by zero");
            }
        }  
        if (e.getSource() == b5) { 
            System.exit(0);  
        }  
    } 

    public static void main(String arg[]) { 
        new simplecalculator(); 
    } 
}

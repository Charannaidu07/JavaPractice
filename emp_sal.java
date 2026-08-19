import java.util.*;
public class emp_sal{
    String name, empno;
    int basic;
    double da,hra,pf,gs,net;
    emp_sal(String n,String en,int bs){
        name = n;
        empno = en;
        basic = bs;
    }
    void compute(){
        da=basic*30/100;
        hra=basic*15/100;
        pf=basic*12/100;
        gs=basic+da+hra;
        net=gs-pf;
    }
    void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Number: " + empno);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + gs);
        System.out.println("Net Salary: " + net);
    }
    public static void main(String args[]){
        String name, empno;
        int basic;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter emp name,number,basic sal: ");
        name=s.nextLine();
        empno=s.next();
        basic=s.nextInt();
        emp_sal ob=new emp_sal(name,empno,basic);
        ob.compute();
        ob.display();
    }
}
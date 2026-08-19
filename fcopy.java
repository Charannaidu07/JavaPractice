import java.io.*;
public class fcopy {
    public static void main(String[] args)throws IOException {
        FileOutputStream f1=new FileOutputStream("copt.txt");
        String s="Welcomming To Java Programming!!!";
        int x=0;
        char c[]=s.toCharArray();
        while(x<s.length()){
            f1.write(c[x]);
            x++;
        }
        f1.close();
        char a;
        FileInputStream f2=new FileInputStream("copt.txt");
        FileOutputStream f3=new FileOutputStream("dest.txt");
        while((x=f2.read())!=-1){
            a=(char)x;
            f3.write(a);
        }
        f2.close();
        f3.close();
    }
}

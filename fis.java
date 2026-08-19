import java.io.*;
class fis{
    public static void main(String args[])throws IOException{
        FileInputStream f1=new FileInputStream("aa.txt");
        int x=0;
        while ((x=f1.read())!=-1){
            System.out.print((char)x);
        }
        f1.close();
    }
}
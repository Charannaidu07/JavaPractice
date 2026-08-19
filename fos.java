import java.io.*;
class fos{
    public static void main(String args[])throws IOException{
        FileOutputStream f1=new FileOutputStream("aa.txt");
        String s="Java Programming!";
        char c[]=s.toCharArray();
        int x=0;
        while (x<s.length()){
            f1.write(c[x]);
            x++;
        }
        f1.close();
    }
}
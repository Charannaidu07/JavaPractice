import java.io.*;
public class fcount {
    public static void main(String[] args) throws IOException{
        int lc=0,wc=0,sc=0,spc=0;
        FileInputStream f1=new FileInputStream("copt.txt");
        int x=0;
        char a;
        while((x=f1.read())!=-1){
            a=(char)x;
            lc++;
            if(a == ' '){
                wc++;
                spc++;
            }
            if(a=='.'||a=='!'){
                sc++;
            }
            x++;
        }
        System.out.println("Character count: " + lc);
        System.out.println("Word count: " + wc);
        System.out.println("Space count: " + spc);
        System.out.println("Sentence count: " + sc);
        f1.close();
    }
}
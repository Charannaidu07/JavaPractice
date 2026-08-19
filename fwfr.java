import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fwfr {
    public static void main(String[] args) throws IOException{
        FileWriter f1=new FileWriter("fwfr.txt");
        f1.write("My Name Is Edamalapati Charan Naidu.");
        f1.close();
        FileReader f2=new FileReader("fwfr.txt");
        int i=0;
        while((i=f2.read())!=-1){
            System.out.println((char)i);
        }
        f2.close();
    }
}

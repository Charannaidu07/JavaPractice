import java.io.*;
public class readfile{
    public static void main(String args[]) throws IOException{
        FileReader f=new FileReader("sample.txt");
        BufferedReader out = new BufferedReader(f);
        String line;
        while ((line = out.readLine()) != null) {
            System.out.println(line);
        }
        out.close();
        f.close();
    }
}
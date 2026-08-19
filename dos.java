import java.io.*;
class dos{
    public static void main(String args[])throws IOException{
        FileOutputStream f1=new FileOutputStream("aaa.txt");
        DataOutputStream d1=new DataOutputStream(f1);
        d1.writeInt(13);
        d1.writeChar('G');
        d1.writeDouble(13.689);
        f1.close();
        FileInputStream f2=new FileInputStream("aaa.txt");
        DataInputStream d2=new DataInputStream(f2);
        System.out.println(d2.readInt());
        System.out.println(d2.readChar());
        System.out.println(d2.readDouble());
        f2.close();
    }
}
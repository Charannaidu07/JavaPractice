import java.util.HashSet;
public class set {
    public static void main(String[] args) {
        HashSet<Integer> s1=new HashSet<>();
        s1.add(4);
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(2);
        System.out.println(s1);
    }
}

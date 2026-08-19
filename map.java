import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class map {
    public static void main(String[] args) {
        Map<Integer, String> m1=new HashMap<>();
        m1.put(1, "charan");
        m1.put(2, "ramesh");
        m1.put(3, "sreenu");
        Set<Map.Entry<Integer, String>> s1=m1.entrySet();
        System.out.println(s1);
    }
}

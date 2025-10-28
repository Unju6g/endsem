import java.util.*;

public class UserAges {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Chris", 30);
        map.put("Alice", 25);
        map.put("Bob", 42);

        for (String name : map.keySet())
            System.out.println(name + " = " + map.get(name));
    }
}

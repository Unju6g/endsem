import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // Create HashSet and TreeSet
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements (including duplicates)
        int[] numbers = {10, 50, 20, 5, 20, 10};

        for (int n : numbers) {
            hashSet.add(n);
            treeSet.add(n);
        }

        // Display HashSet (unordered)
        System.out.println("HashSet (no order): " + hashSet);

        // Display TreeSet (sorted)
        System.out.println("TreeSet (sorted): " + treeSet);
    }
}

import java.util.TreeSet;

public class EmployeeNames {
    public static void main(String[] args) {
        // Create a TreeSet to store employee names
        TreeSet<String> employees = new TreeSet<>();

        // Add employee names (including duplicates)
        employees.add("Ravi");
        employees.add("Anita");
        employees.add("Kiran");
        employees.add("Ravi");   // duplicate
        employees.add("Meena");
        employees.add("Anita");  // duplicate

        // Display all employee names
        System.out.println("Employee Names in TreeSet:");
        for (String name : employees) {
            System.out.println(name);
        }
    }
}

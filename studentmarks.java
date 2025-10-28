import java.util.*;

public class studentmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> marks = new HashMap<>();
        int choice;

        do {
            System.out.println("\n1. Add subject");
            System.out.println("2. Search subject");
            System.out.println("3. Display all subjects");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter subject name: ");
                String subject = sc.nextLine();
                System.out.print("Enter the marks: ");
                int score = sc.nextInt();
                sc.nextLine();
                marks.put(subject, score);
                System.out.println("Subject added successfully!");
            } 
            else if (choice == 2) {
                System.out.print("Enter subject name to search: ");
                String subject = sc.nextLine();
                if (marks.containsKey(subject)) {
                    System.out.println("Marks in " + subject + ": " + marks.get(subject));
                } else {
                    System.out.println("Subject not found!");
                }
            } 
            else if (choice == 3) {
                System.out.println("All subjects & marks:");
                for (String sub : marks.keySet()) {
                    System.out.println(sub + " : " + marks.get(sub));
                }
            } 
            else if (choice == 4) {
                System.out.println("Exiting... Thank you!");
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}

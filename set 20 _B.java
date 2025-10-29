import java.io.*;
import java.util.ArrayList;

class Student implements Serializable {
    String name;
    ArrayList<String> courses;
    transient String tempPassword;

    Student(String n, ArrayList<String> c, String p) {
        name = n;
        courses = c;
        tempPassword = p;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("Python");

        Student s1 = new Student("Ravi", courseList, "abc123");

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s1);
            System.out.println("Serialized Successfully.");
        } catch (Exception e) { e.printStackTrace(); }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("\nName: " + s2.name);
            System.out.println("Courses: " + s2.courses);
            System.out.println("Temp Password: " + s2.tempPassword); // null
        } catch (Exception e) { e.printStackTrace(); }
    }
}

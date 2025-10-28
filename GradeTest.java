class InvalidGradeException extends RuntimeException {
    InvalidGradeException(String msg) { super(msg); }
}

class ReportCard {
    void setGrade(String grade) {
        if (!grade.matches("[ABCDF]"))
            throw new InvalidGradeException("Invalid Grade: " + grade);
        System.out.println("Grade accepted: " + grade);
    }
}

public class GradeTest {
    public static void main(String[] args) {
        ReportCard r = new ReportCard();
        try {
            r.setGrade("G");
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

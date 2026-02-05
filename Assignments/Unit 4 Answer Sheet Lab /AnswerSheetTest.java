import java.util.ArrayList;

public class AnswerSheetTest {
    public static void main(String[] args) {
        // Test StudentAnswerSheet
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("A");
        a1.add("B");
        a1.add("C");
        StudentAnswerSheet s1 = new StudentAnswerSheet("Alice", a1);
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Initial Test Score: " + s1.getTestScore());
        ArrayList<String> key = new ArrayList<>();
        key.add("A");
        key.add("B");
        key.add("D");
        double grade1 = s1.getGrade(key);
        System.out.println("Grade: " + grade1);
    }
}

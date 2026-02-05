
import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("Key or submissions cannot be null.");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }


    public void submit(StudentAnswerSheet student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }
        submissions.add(student);
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }


    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setAnswerKey(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        this.answerKey = key;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        if (submissions == null) {
            throw new IllegalArgumentException("Submissions cannot be null.");
        }
        this.submissions = submissions;
    }

    public void gradeTests() {
        for (StudentAnswerSheet student : submissions) {
            student.setTestScore(student.getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.isEmpty()) {
            return "";
        }
        StudentAnswerSheet topStudent = submissions.get(0);
        for (StudentAnswerSheet student : submissions) {
            if (student.getTestScore() > topStudent.getTestScore()) {
                topStudent = student;
            }
        }
        return topStudent.getName();

    }


}

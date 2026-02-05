import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException("Name or answers cannot be null.");
        }
        this.name = name;
        this.answers = answers;
        testScore = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getTestScore() {
        return testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = name;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public void setAnswers(ArrayList<String> answers) {
        if (answers == null) {
            throw new IllegalArgumentException("Answers cannot be null.");
        }
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        if (answers.size() != key.size()) {
            throw new IllegalArgumentException("Answers and key must be of the same length.");
        }

        double score = 0;
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equals(key.get(i))) {
                score += 1;
            } else if (answers.get(i).equals("?")) {
                score += 0;
            } else {
                score -= 0.25;
            }


        }
        return score;
    }



}

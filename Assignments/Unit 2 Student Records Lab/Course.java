public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;


    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String output = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            output += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return output;
    }

    public String findBestStudent() { // find best total average
        String bestStudentName = "";
        double highestAverage = -1.0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            StudentRecord student = enrolledStudents[i];
            double totalAverage = student.getAverage(0, student.getScores().length - 1);
            if (totalAverage > highestAverage) {
                highestAverage = totalAverage;
                bestStudentName = student.getName();
            }
        }

        return bestStudentName;

    }

    public double calculateTestAverage(int testNumber) {
        double sum = 0.0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            sum += enrolledStudents[i].getTestScore(testNumber);
        }
        return sum / enrolledStudents.length;
    }



}

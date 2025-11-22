public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;


    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }

    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null
                    && enrolledStudents[i].getName().equals(student.getName())) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int additionalSeats) {
        StudentRecord[] newEnrolledStudents =
                new StudentRecord[enrolledStudents.length + additionalSeats];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newEnrolledStudents[i] = enrolledStudents[i];
        }
        enrolledStudents = newEnrolledStudents;
    }



}

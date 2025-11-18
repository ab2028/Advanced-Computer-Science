public class CourseTester {
    public static void main(String[] args) {
        StudentRecord ana = new StudentRecord("Ana", new int[]{90, 89, 91, 95});
        System.out.println(ana.toString());
        System.out.println("Average: " + ana.getAverage(0, 3));
        System.out.println("Highest Score: " + ana.getTestScore(1));

        StudentRecord bob = new StudentRecord("Bob", new int[]{85, 87, 90, 92});
        StudentRecord charlie = new StudentRecord("Charlie", new int[]{88, 90, 85, 91});
        StudentRecord[] students = {ana, bob, charlie};
        Course course = new Course("Computer Science", students);
        System.out.println(course.toString());

    }

}

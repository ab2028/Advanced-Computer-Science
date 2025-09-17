public class StudentTester {
    public static void main(String[] args) {
        Student badStudent = new Student("Badstu Dent");
        Student goodStudent = new Student("Goodstu Dent");
        Student jock = new Student("Chad", 12);
        Student cheerleader = new Student("Brittany", 11);

        System.out.println(badStudent.toString());
        System.out.println(goodStudent.toString());
        System.out.println(jock.toString());
        System.out.println(cheerleader.toString());

        badStudent.setGrade(9);
        goodStudent.setGrade(12);
        jock.setGrade(8);
        cheerleader.setGrade(12);

        System.out.println(badStudent.toString());
        System.out.println(goodStudent.toString());
        System.out.println(jock.toString());
        System.out.println(cheerleader.toString());

        System.out.println("Is Badstu Dent equal to Goodstu Dent? " + badStudent.equals(goodStudent));
    }


}

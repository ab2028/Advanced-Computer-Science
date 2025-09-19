public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setId(String input) {
        this.id = input;
    }

    public void setName(String input) {
        this.name = input;
    }

    public void setGrade(int input) {
        this.grade = input;
    }


    public String toString() {
        return this.name + " is a " + this.grade + "th grade student. Their id is " + this.id;
    }

    public boolean equals(Student other) {
        return this.name.equals(other.name)
            && this.id.equals(other.id)
            && this.grade == other.grade;
    }

    public String generateId() {
        String d1 = "" + (int) (Math.random() * 8 + 1);
        String d2 = "" + (int) (Math.random() * 8 + 1);
        String d3 = "" + (int) (Math.random() * 8 + 1);
        String d4 = "" + (int) (Math.random() * 10);
        String d5 = "" + (int) (Math.random() * 10);
        String d6 = "" + (int) (Math.random() * 10);
        String d7 = "" + (int) (Math.random() * 10);

        return d1 + d2 + d3 + "-" + d4 + d5 + d6 + d7;

    }


}

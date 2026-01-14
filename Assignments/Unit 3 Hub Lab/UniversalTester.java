public class UniversalTester {
    public static void main(String[] args) {
        // Hub tests

        // registerStudent

        // test blank name, password, invalid email, name containing @, name alr taken, bad student
        // storage (students array is null or studentCount < 0)

        Hub hub = new Hub();
        try {
            hub.registerStudent("", "password", "a@m.com");
            System.out.println("Test failed: Expected exception for blank name.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            hub.registerStudent("sdfs", "", "a@m.com");
            System.out.println("Test failed: Expected exception for blank password.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            hub.registerStudent("sfds", "sfdsf", "email");
            System.out.println("Test failed: Expected exception for invalid email.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            hub.registerStudent("@@@@@@", "password", "a@m.com");
            System.out.println("Test failed: Expected exception for invalid name.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        // name already taken
        try {
            hub.registerStudent("student1", "password", "hi@gmail.com");
            hub.registerStudent("student1", "password2", "fjsldkjfs");
            System.out.println("Test failed: Expected exception for name already taken.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        // bad student storage error cannot be triggered as private variables cannot be modified
        // directly

        // loginStudent
        // test blank username, blank password, student not found, wrong password

        try {
            hub.loginStudent("", "password");
            System.out.println("Test failed: Expected exception for blank username.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            hub.loginStudent("afds", "");
            System.out.println("Test failed: Expected exception for blank password.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            hub.loginStudent("jfsldkjflskdjflskdjf", "password");
            System.out.println("Test failed: Expected exception for student not found.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            hub.registerStudent("abcd", "correctpassword", "a@gmail.com");
            hub.loginStudent("abcd", "wrongpassword");
            System.out.println("Test failed: Expected exception for wrong password.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        // doesStudentExist

        // test blank displayName, student already exists

        try {
            hub.doesStudentExist("");
            System.out.println("Test failed: Expected exception for blank displayName.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            hub.registerStudent("fjfjfjf", "password", "a@gmail.com");
            hub.doesStudentExist("fjfjfjf");
            System.out.println("Test failed: Expected exception for student already exists.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }


        // Student tests

        // Student constructor

        try {
            Student studenta = new Student("", "sdfsdf", "ab@g.com");
            System.out.println("Test failed: Expected exception for blank name.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }
        try {
            Student studentb = new Student("sdfsdf", "", "ab@g.com");
            System.out.println("Test failed: Expected exception for blank password.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Student studentc = new Student("dfsdf", "sdfds", "");
            System.out.println("Test failed: Expected exception for blank email.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Student studentd = new Student("dfsdf", "sdfds", "fsdlfsldjf");
            System.out.println("Test failed: Expected exception for invalid email.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Student studente = new Student("name@name", "sdfds", "jsdlsfsdf@g.com");
            System.out.println("Test failed: Expected exception for name containing '@'.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }


        try {
            hub.registerStudent("john", "password", "fsdjf@g.com");
            Student studentf = new Student("john", "sdfds", "jsdls@g.com");
            System.out.println("Test failed: Expected exception for name already taken.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }


        // changeName

        // // test blank newDisplayName, newDisplayName containing @, name alr taken


        try {
            Student A = new Student("hihihi", "sdfds", "fsdljkf@gmail.com");
            A.changeName("");
            System.out.println("Test failed: Expected exception for blank newDisplayName.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Student B = new Student("hihihi", "sdfds", "fsdljkf@gmail.com");
            B.changeName("hi@@@fhsdf");
            System.out.println("Test failed: Expected exception for name containing '@'.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            hub.registerStudent("s", "password", "f@g.com");
            Student C = new Student("nameeee", "sdfds", "fsdlj@g.com");
            C.changeName("s");
            System.out.println("Test failed: Expected exception for name already taken.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        // resetPassword

        // generated password less than 8 chars cannot be triggered as the generator always creates
        // 12-char passwords


        // submitAssignment

        try {
            Student E = new Student("studentE", "ssss", "f@g.com");
            E.assignments = null;
            E.submitAssignment("title", "description");
            System.out.println("Test failed: Expected exception for missing assignment storage.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Student F = new Student("studentF", "ssss", "f@g.com");
            for (int i = 0; i < 5; i++) {
                F.submitAssignment("title", "description");
            }
            F.submitAssignment("title", "description"); // exceed limit
            System.out.println("Test failed: Expected exception for assignment limit reached.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Student G = new Student("studentE", "ssss", "f@g.com");
            G.submitAssignment("", "description");
            System.out.println("Test failed: Expected exception for blank assignment title.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Student H = new Student("studentH", "ssss", "f@g.com");
            H.submitAssignment("dsfdsf", "");
            System.out.println("Test failed: Expected exception for blank assignment description.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }


        // Assignment tests

        // Constructor

        try {
            Assignment a = new Assignment("", "description");
            System.out.println("Test failed: Expected exception for blank title.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Assignment b = new Assignment("title", "");
            System.out.println("Test failed: Expected exception for blank description.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        // setTitle

        try {
            Assignment c = new Assignment("aa", "fsdfs");
            c.setTitle("");
            System.out.println("Test failed: Expected exception for blank title in setTitle.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        // setDescription

        try {
            Assignment d = new Assignment("aa", "fsdfs");
            d.setDescription("");
            System.out.println(
                    "Test failed: Expected exception for blank description in setDescription.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        // validateTitle

        try {
            Assignment e = new Assignment("aa", "fsdfs");
            e.validateTitle("");
            System.out.println("Test failed: Expected exception for blank title in validateTitle.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Assignment f = new Assignment("aa", "fsdfs");
            f.validateTitle("profaniTY");
            System.out.println("Test failed: Expected exception for profanity in title.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Assignment g = new Assignment("aa", "fsdfs");
            g.validateTitle("assgn.exe");
            System.out.println("Test failed: Expected exception for .exe in title.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Assignment h = new Assignment("aa", "fsdfs");
            String longTitle =
                    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                            + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                            + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                            + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            h.validateTitle(longTitle);
            System.out.println("Test failed: Expected exception for title too long.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        // validateDescription

        try {
            Assignment i = new Assignment("aa", "fsdfs");
            i.validateDescription("");
            System.out.println(
                    "Test failed: Expected exception for blank description in validateDescription.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Assignment j = new Assignment("aa", "fsdfs");
            j.validateDescription("ProFanIty.");
            System.out.println("Test failed: Expected exception for profanity in description.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }

        try {
            Assignment k = new Assignment("aa", "fsdfs");
            String longDesc = "";
            for (int i = 0; i < 100; i++) {
                longDesc +=
                        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            }
            k.validateDescription(longDesc);
            System.out.println("Test failed: Expected exception for description too long.");
        } catch (Exception e) {
            System.out.println("Test passed: Caught exception: " + e.getMessage());
        }



    }
}


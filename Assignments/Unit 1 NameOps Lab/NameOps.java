public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        // indexOf(), charAt(), substring(), and length().
        if (indexOfFirstSpace(name) == -1) {
            return -1;
        }
        String nameSubstring = name.substring(indexOfFirstSpace(name) + 1, name.length());
        System.out.println(nameSubstring);
        if (indexOfFirstSpace(nameSubstring) == -1) {
            return -1;
        }
        return indexOfFirstSpace(nameSubstring) + +indexOfFirstSpace(name) + 1;

    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        }
        return name.substring(0, indexOfFirstSpace(name));
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return "";
        }
        if (indexOfSecondSpace(name) == -1) {
            return name.substring(indexOfFirstSpace(name) + 1, name.length());

        }
        return name.substring(indexOfSecondSpace(name) + 1, name.length());
        
    }

    public static String findMiddleName(String name) {
        if (indexOfSecondSpace(name) == -1) { // if ind of 1st sp = -1, 2nd is also -1 so alr covd
            return "";
        }
        return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name)); // shd be +1!
    }

    public static String generateLastFirstMidInitial(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        }
        if (indexOfSecondSpace(name) == -1) {
            return findLastName(name) + ", " + findFirstName(name);
        }
        return findLastName(name) + ", " + findFirstName(name) + " "
                + findMiddleName(name).charAt(0) + ".";

    }

}

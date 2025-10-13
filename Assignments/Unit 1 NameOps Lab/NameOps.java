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
        return indexOfFirstSpace(nameSubstring) + + indexOfFirstSpace(name) + 1;

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
        return name.substring(indexOfFirstSpace(name), name.length());
    }

    public static String findMiddleName(String name) {
        if (indexOfSecondSpace(name) == -1) {  // if index of first space = -1, this is also -1 so this case is already covered
            return "";
        }
        return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name)); // should be +1!
    
    }

    public static String generateLastFirstMidInitial(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        }
        if (indexOfSecondSpace(name) == -1) {
            return findLastName(name) + ", " + findFirstName(name);
        }
        return findLastName(name) + ", " + findFirstName(name) + " " + findMiddleName(name).charAt(0) + ".";

    }

}

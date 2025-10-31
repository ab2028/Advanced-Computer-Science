public class AutoUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return 0;
        } else if (cleanlinessLevel < 10) {
            return cleanlinessLevel;
        } else {
            return 10;
        }
    }

    public static String generateUsername(String name) { // potential precondition
        int num = (int) (Math.random() * 100 + 1950);
        return "@" + name.substring(0, name.indexOf(" ")).toLowerCase() + "_"
                + name.substring(name.indexOf(" ") + 1).toLowerCase() + "_" + num;
    }

    public static void cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        // name will be in the form (first name) (multiple spaces) (last name)
        String trimmedName = name.trim();
        return trimmedName.substring(0, trimmedName.indexOf(" ") + 1)
                + trimmedName.substring(trimmedName.indexOf(" ") + 1).trim();

    }
}

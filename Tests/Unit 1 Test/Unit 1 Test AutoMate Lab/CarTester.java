public class CarTester {
    public static void main(String[] args) {

        // testing fixname
        String nameWithSpaces = "  Alice    Smith   ";
        String fixedName = AutoUtils.fixName(nameWithSpaces);
        System.out.println("Fixed Name: '" + fixedName + "'");

        // testing all methods
        Car car1 = new Car("Toyota Camry", "  John   Doe  ", 100);
        System.out.println("Owner Name: '" + car1.getOwnerName() + "'");
        System.out.println("Username: " + car1.getUsername());
        System.out.println("Cleanliness Level: " + car1.getCleanlinessLevel());
        AutoUtils.cleanCar(car1);
        System.out.println("Cleanliness Level after cleaning: " + car1.getCleanlinessLevel());
        System.out.println(car1.toString());

        System.out.println(AutoUtils.generateUsername("John Doe"));

    }
}

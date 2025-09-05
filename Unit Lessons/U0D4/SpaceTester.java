public class SpaceTester {
    public static void main(String[] args) {
        // 1. instantiate (make an instance of/create) a spaceship object
        Spaceship ship = new Spaceship("red", 30, 90.0, true);
        // the new keyword creates a new instance of the class (aka an object)

        // 2. invoke a method
        String shipDescription = ship.getDescription();

        int shipPassengerCount = ship.getPassengerCount();

        double shipFuelLevel = ship.getFuelLevel();

        boolean shipShieldsActive = ship.getShieldsActive();

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);
        System.out.println(shipFuelLevel);
        System.out.println(shipShieldsActive);

        // 3. manipulate the data
        ship.setDescription("blue");
        ship.setPassengerCount(20);
        ship.setShieldsActive(false);

        shipDescription = ship.getDescription();
        shipPassengerCount = ship.getPassengerCount();
        shipShieldsActive = ship.getShieldsActive();

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);
        System.out.println(shipShieldsActive);


        




        
    }
}

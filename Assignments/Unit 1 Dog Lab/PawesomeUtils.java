public class PawesomeUtils { // Helpers for Dog class


    // sum of digits of ID (3 digits), mod 10, add 'F'.
    public static char generateDogChar(int dogId) {
        int sum;
        sum = (dogId / 100) + ((dogId / 10) % 10) + (dogId % 10);
        return (char) ('F' + (sum % 10));
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName + ".";
        } else {
            return dog.getName() + " cannot be picked up by " + personName
                    + ", they are not the owner!";
        }
    }

    public static void checkIn(Dog dog, String personName) { 
        // validate dog tag; only if valid let check in
        // validate:
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
        } else {
            System.out.println(
                    "COUNTERFEIT DOG DETECTED " + dog.getName() + " ENTRY DENIED GET OUT ! ! !");
        }

    }

    public static int convertAgeToHumanAge(Dog dog) {
        int dogAge = dog.getAge();
        if (dogAge <= 2) {
            return dogAge * 9 + 6;
        } else {
            return 24 + (dogAge - 2) * 5;
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears <= 24) {
            return 2;
        } else {
            return 2 + (humanYears - 24) / 5;
        }
    }


    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 900 + 100); // 100 = st #, 999 = end #, inclusive
        } // but what if the random number somehow equals dogId....
    }



    public static boolean validateDogTag(Dog dog) {
        int id = dog.getDogId();
        int validId = validateDogId(id);
        char dogChar = PawesomeUtils.generateDogChar(validId);
        String newDogTag = "" + validId + dogChar;
        return newDogTag.equals(dog.getDogTag());
    }


}

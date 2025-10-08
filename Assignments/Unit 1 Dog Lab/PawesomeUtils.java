public class PawesomeUtils {

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 900  + 100); // 100 = starting number, 999 = ending number, inclusive.
        } // but what if the random number somehow equals dogId....
    }



    public static boolean validateDogTag(Dog dog) {
        int id = dog.getDogId();
        int validId = validateDogId(id);
        char dogChar = Dog.generateDogChar(validId);
        String newDogTag = "" + validId + dogChar;
        return newDogTag.equals(dog.getDogTag());
    }


}

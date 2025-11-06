public class ArrayDemo{
    public static void main(String[] args) {

        // Pokemon
        // you can have a team of 6, index is max of 5
        
        // Pokemon[] team = new Pokemon[6];
        //{0, 1, 2, 3, 4, 5} ordered list

        // team[3] = new Pokemon("Charizard");
        // {0, 1, 2, "Charizard", 4, 5}


        // this code created a list of size 6, so the max index is 5

        // Pokemon[] box = new Pokemon[30];
        // cannot resize lists, but are they also immutable?

        // Pokemon[] box2 = new Pokemon[1000]; 

        int[] myFavoriteNumbers = new int[4];
        // my favorite numbers sub 0
        myFavoriteNumbers[0] = 6;
        myFavoriteNumbers[1] = 7;
        myFavoriteNumbers[2] = 67;
        myFavoriteNumbers[3] = 4; 

        myFavoriteNumbers[0] = 3;

        System.out.println(myFavoriteNumbers[3]);

        // print out the entire list using a for loop

        for (int i = 0; i < 4; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        System.out.println(myFavoriteNumbers.length);

        // what if i actually have 5 favorite numbers?

        // list sizes are immutable <- can't change it without creating a new object
        // Strings are a list (array) of characters! (hence) They are also immutable.
        // {'h', 'e', 'l', 'l', 'o'}

        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";
        // beatles[1] = "Paul McCartney";
        
        String[] beatles = {"John Lennon", "Paul McCartney", null, "Ringo Starr"};

        // challenge: update the beatles list to include you as the fifth beatle

        String[] beatles2 = new String[5];
        for (int i = 0; i < 4; i++) {
            
            beatles2[i] = beatles[i];
            if(beatles[i] != null) {
            System.out.println(beatles[i].length());
            } else {
                System.out.println("This element is null");
            }
        }

        beatles2[4] = "Ava Berenji";


        String[] list = new String[3];
        // by default is {null, null, null}

        // for integers, 0. for booleans, false. for string, null

        // System.out.println(args.length)

 




    }
}
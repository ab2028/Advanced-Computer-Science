public class StaticVariableDemo {

    // ensure you study copies of variables versus making new variables

    // if you want many objects to share the same variable and all modify when one modifies it



    public static void main(String[] args) {
        Jigglypuff jigglyOriginal = new Jigglypuff();
        System.out.println(jigglyOriginal.getType());

        Jigglypuff.setType("Fairy");

        for (int i = 0; i < 100; i++) {
            Jigglypuff jiggly = new Jigglypuff();
            System.out.println(jiggly.getType());

        }
    }

}

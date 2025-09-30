public class Demo {

    private int hello;
    private int world;
    private String goodbye;

    
    public int getHello() {
        return hello;
    }


    public void setHello(int hello) {
        this.hello = hello;
    }


    public int getWorld() {
        return world;
    }


    public void setWorld(int world) {
        this.world = world;
    }


    public String getGoodbye() {
        return goodbye;
    }


    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }


    public static void main(String[] args) {
        // AND
        int age = 20;
        boolean isFelon = false;

        if ((age >= 18 && age >= 35) && !isFelon) {
            System.out.println("You can run for presidency and vote!");
        }

        age = 15;

        if (age < 35 || isFelon) { // doesn't even check isFelon; same with and (&&)
            System.out.println("You cannot run for presidency.");
        }

        if (!(age > 18 || isFelon)) { // order of checking - demorgan's law?
            System.out.println("You cannot vote.");
        }

        // READABILITY IS IMPORTANT
        boolean isRegistered = true;
        boolean isCitizen = true;
        String country = "USA";

        if(isRegistered){ 
            if(age >= 18){
                if(isCitizen){
                    if (country.equals("USA")) {
                        System.out.println("You can vote!");
                    }
                }
            }
        }

        // Guarding If statements - readability
        // gates that prevent reaching the final statement
        if(!isRegistered) {
            return;
        }
        if(age < 18) {
            return;
        }
        if(!isCitizen) {
            return;
        }
        if (isFelon) {
            return;
        }
        if(!country.equals("USA")) {
            return;
        }
        System.out.println("You can vote!");
    }
}
public class Cat { // 1. Changed Public to public, changed class name to Cat
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { // 2. Capitalized constructor name, added input parameter "breed" and data type
		this.name = name; // 3. Changed instance variable name to this.name (x2)
		this.breed = breed;
	    isHungry = true; // 4. Changed "yes" to true
		livesRemaining = 9;
	}

	public String getName() { // 5. Changed void to String
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getBreed() { // 6. Added getters and setters for breed variable
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


	public boolean getIsHungry(){ // 7. Changed void to boolean and method name to getIsHungry
		return isHungry;
	}

	public void feed() { // 8. Changed boolean to void
		this.isHungry = false;
	}

    public int getLivesRemaining() { // 9. Added getters and setters for livesRemaining variable
        return livesRemaining;
    }

    public void setLivesRemaining(int livesRemaining) {
        this.livesRemaining = livesRemaining;
    }

	public boolean equals(Cat other) { // 10. Changed == to .equals() method, changed = to ==
		return this.name.equals(other.name) && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining;
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining."; // 11. Changed System.out.println to return
	}

    

    
}
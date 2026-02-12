import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (!(rows > 0 && cols > 0)) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        this.kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Input must not be null!");
        }

        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] == null) {
                    kennels[i][j] = animal;
                    return;
                }
            }

        }
        System.out.println("No empty kennels.");
    }


    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("Input must not be null!");
        }
        if (row < 0 || row >= kennels.length || col < 0 || col >= kennels[row].length) {
            throw new IllegalArgumentException("Invalid row or column index.");
        }
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }

    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Input must not be null!");
        }
        for (Dog dog : animals) {
            add(dog);
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || row >= kennels.length || col < 0 || col >= kennels[row].length) {
            throw new IllegalArgumentException("Invalid row or column index.");
        }
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("There is no dog in this kennel!");
        }
        Dog dog = kennels[row][col];
        kennels[row][col] = null;
        return dog;

    }

    public ArrayList<Dog> search(String name) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        if (name == null) {
            throw new IllegalArgumentException("Input name cannot be null!");
        }
        for (Dog[] row : kennels) {
            for (Dog dog : row) {
                if (dog != null && dog.getName().equals(name)) {
                    dogs.add(dog);
                }
            }
        }
        return dogs;
    }

    public ArrayList<Dog> search(int age) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        if (age < 0) {
            throw new IllegalArgumentException("Input age cannot be negative!");
        }
        for (Dog[] row : kennels) {
            for (Dog dog : row) {
                if (dog != null && dog.getAge() == age) {
                    dogs.add(dog);
                }
            }
        }
        return dogs;
    }


}


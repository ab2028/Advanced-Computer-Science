public class Car {
    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;

    public Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        this.username = AutoUtils.generateUsername(this.ownerName);
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsOilChange = false;
    }

    public Car() {
        this.model = "Unknown";
        this.ownerName = "No One";
        this.username = AutoUtils.generateUsername(this.ownerName);
        this.cleanlinessLevel = 5;
        this.needsOilChange = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    public String toString() {
        return "== ABOUT CAR ==\nModel: " + model + "\n" + "Owner: " + ownerName + "\n"
                + "Username: " + username + "\n" + "Cleanliness Level: " + cleanlinessLevel + "\n"
                + "Does car need oil change? " + (needsOilChange ? "Yes" : "No");
    }

    public boolean equals(Car other) {
        return this.model.equals(other.model) && this.ownerName.equals(other.ownerName)
                && this.username.equals(other.username)
                && this.cleanlinessLevel == other.cleanlinessLevel
                && this.needsOilChange == other.needsOilChange;
    }


}

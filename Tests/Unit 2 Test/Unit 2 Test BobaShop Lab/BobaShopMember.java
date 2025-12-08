
public class BobaShopMember {
    private String name;
    private boolean[] loyaltyCredits;

    public BobaShopMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (!loyaltyCredits[i]) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i]) {
                count += 1;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int c = countLoyaltyCredits();
        if (c >= 6) {
            return "Gold Member";
        } else if (c < 3) {
            return "Plus Member";
        } else {
            return "Silver Member";
        }
    }

    public String loyaltyHistory() {
        String output = "Loyalty History: [";
        for (int i = 0; i < countLoyaltyCredits(); i++) {
            output += "X";
            if (i < 9) {
                output += ", ";
            }
        }
        for (int i = 0; i < 10 - countLoyaltyCredits(); i++) {
            output += "-";
            if (i < 9) {
                output += ", ";
            }
        }
        return output + "]";

    }

    public String toString() {
        return name + " (" + determineMembershipStatus() + "), " + loyaltyHistory();
    }

    public boolean equals(BobaShopMember other) {
        boolean lc = false;
        for (int i = 0; i < 10; i++) {
            if (this.loyaltyCredits[i] != other.loyaltyCredits[i]) {
                return false;
            }
        }
        return this.name.equals(other.name);
    }



}

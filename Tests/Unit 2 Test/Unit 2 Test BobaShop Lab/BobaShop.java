public class BobaShop {
    private String shopName;
    private BobaShopMember[] registeredMembers;

    public BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    public BobaShop(String shopName, int initialCapacity) {
        this.shopName = shopName;
        registeredMembers = new BobaShopMember[initialCapacity];
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        BobaShopMember[] output = new BobaShopMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            output[i] = registeredMembers[i];
        }
        registeredMembers = output;
    }

    public void registerMember(BobaShopMember member) {
        if (isFull()) {
            BobaShopMember[] output = new BobaShopMember[registeredMembers.length + 1];
            for (int i = 0; i < registeredMembers.length; i++) {
                output[i] = registeredMembers[i];
            }
            output[output.length - 1] = member;
            registeredMembers = output;
        } else {
            for (int i = 0; i < registeredMembers.length; i++) {
                if (registeredMembers[i] == null) {
                    registeredMembers[i] = member;
                    return;
                }
            }
        }

    }

    public String toString() {
        String output = "== " + shopName + " Members ==\n";
        int count = 0;
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null) {
                count += 1;
                output += "" + count + "). " + registeredMembers[i].toString() + "\n";
            }

        }
        return output;
    }

    public boolean deleteMember(BobaShopMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null) {
                if (registeredMembers[i].equals(member)) {
                    registeredMembers[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }
}
